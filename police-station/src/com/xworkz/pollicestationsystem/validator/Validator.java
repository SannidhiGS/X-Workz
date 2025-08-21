package com.xworkz.pollicestationsystem.validator;

import com.xworkz.pollicestationsystem.police.Police;

public class Validator {
    Police police;
    public boolean getPoliceValdation(Police police){
        boolean isPoliceId=false;
        if(police.getPoliceId()!=0 && police.getPoliceId()>0)
            isPoliceId=true;
        else
            System.out.println("The ID not valid");

        boolean isPoliceName=false;
        if(police.getPoliceName()!=null && !police.getPoliceName().isEmpty())
            isPoliceName=true;
        else
            System.out.println("The name is not valid");

        boolean isPoliceRank=false;
        if(police.getRank()!=null && !police.getRank().isEmpty())
            isPoliceRank=true;
        else
            System.out.println("The rank not valid");

        boolean isDutyArea=false;
        if(police.getDutyArea()!=null && !police.getDutyArea().isEmpty())
            isDutyArea=true;
        else
            System.out.println("The value not valid");

        boolean isContactNum=false;
            if(police.getContactNumber()!=null && !police.getContactNumber().isEmpty())
                isContactNum=true;

        boolean getDetails=false;
        if(isPoliceId && isPoliceName && isPoliceRank && isDutyArea && isContactNum)
            getDetails=true;
        else
            System.out.println("The police information not valid");

        return getDetails;
    }
}
