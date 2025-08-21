package com.xworkz.pollicestationsystem.policestation;

import com.xworkz.pollicestationsystem.police.Police;
import com.xworkz.pollicestationsystem.validator.Validator;

public class Policestation {
    Police police;

    public boolean getPoliceInfo(Police police){
        boolean getPoliceInfo=false;
        Validator validator=new Validator();

        boolean data=validator.getPoliceValdation(police);
        if (data){
            this.police=police;
            getPoliceInfo=true;
        }
        else
            System.out.println("Validation info not true");
        return getPoliceInfo;
    }

    public void getPoliceDetails(){
        System.out.println("The police ID: "+police.getPoliceId());
        System.out.println("The police Name: "+police.getPoliceName());
        System.out.println("The police Rank: " +police.getRank());
        System.out.println("The duty Area :"+police.getDutyArea());
        System.out.println("The contact num is: "+police.getContactNumber());
    }
}
