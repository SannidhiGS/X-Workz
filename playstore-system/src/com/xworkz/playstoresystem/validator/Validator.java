package com.xworkz.playstoresystem.validator;

import com.xworkz.playstoresystem.user.User;

public class Validator {
    User user;
    public boolean getUserValidate( User user){


        boolean isName=false;
        if(user.getName()!=null && !user.getName().isEmpty())
            isName=true;
        else
            System.out.println("The user name not valid");

        boolean isSurName=false;
        if(user.getSurName()!=null && !user.getSurName().isEmpty())
            isSurName=true;
        else
            System.out.println("The sur name not valid");

        boolean isDob=false;
        if(user.getDob()!=null && !user.getDob().isEmpty())
            isDob=true;
        else
            System.out.println("The DOB not valid");

        boolean isAddress=false;
        if(user.getAddress()!=null && !user.getAddress().isEmpty())
            isAddress=true;
        else
            System.out.println("The address not registered");

        boolean isContactNo=false;
        if(user.getContactNo()!=null && !user.getContactNo().isEmpty())
            isContactNo=true;
        else
            System.out.println("The contact no not valid");

        boolean isAge=false;
        if(user.getAge()!=0 && user.getAge()>0)
            isAge=true;
        else
            System.out.println("The age not valid");

        boolean isFather=false;
        if (user.getFatherName()!=null && !user.getFatherName().isEmpty())
            isFather=true;
        else
            System.out.println("The father name not valid");
        boolean isMother=false;
        if (user.getMotherName()!=null && !user.getMotherName().isEmpty())
            isMother=true;
        else
            System.out.println("The father name not valid");
        boolean isAdharNo=false;
        if(user.getAdharNo()!=null && !user.getAdharNo().isEmpty())
            isAdharNo=true;
        else
            System.out.println("The adher not valid");

        boolean isState=false;
        if (user.getState()!=null && !user.getState().isEmpty())
            isState=true;
        else
            System.out.println("The state valid");

        boolean isOccupation=false;
        if (user.getOccupation()!=null && !user.getOccupation().isEmpty())
            isOccupation=true;
        else
            System.out.println("The occupation not valid");

        boolean isPassword=false;
        if (user.getPassword()!=null && !user.getPassword().isEmpty()) {
            isPassword=true;
        } else
            System.out.println("The password not valid");

        boolean isConPassword=false;
        if (user.getConPassword()!=null && !user.getConPassword().isEmpty())
            isConPassword=true;
        else
            System.out.println("The Confirm password not valid");

        boolean isQualified=false;
        if (user.getQualification()!=null && !user.getQualification().isEmpty())
            isQualified=true;
        else
            System.out.println("The Qualification not valid");

        boolean isPincode=false;
        if (user.getPinCode()!=null && !user.getPinCode().isEmpty())
            isPincode=true;
        else
            System.out.println("The pincode not valid");

        boolean getUserValidate=false;
        if(isName && isSurName && isDob && isAge && isAddress && isAdharNo && isPassword && isConPassword &&isPincode && isFather && isMother)
            getUserValidate=true;
        else
            System.out.println("The user not valid");
        return getUserValidate;
    }

}
