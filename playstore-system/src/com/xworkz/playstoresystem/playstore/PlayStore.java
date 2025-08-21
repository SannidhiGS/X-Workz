package com.xworkz.playstoresystem.playstore;

import com.xworkz.playstoresystem.user.User;
import com.xworkz.playstoresystem.validator.Validator;

public class PlayStore {
    User user;
    public boolean getUserData(User user){
        boolean getUserData=false;

        Validator validator=new Validator();

        boolean data=validator.getUserValidate(user);

        if(data){
            this.user=user;
            getUserData=true;
        }
        else
            System.out.println("User not valid");
        return getUserData;
    }

    public void getUserInfo(){
        System.out.println("The user name: "+user.getName());
        System.out.println("The user sur name: "+user.getSurName());
        System.out.println("The user age :"+ user.getAge());
        System.out.println("The user dob: "+user.getDob());
        System.out.println("The user contact no :"+user.getContactNo());
        System.out.println("The user address "+user.getAddress());
        System.out.println("Father: "+user.getFatherName());
        System.out.println("Mother name "+user.getMotherName());
        System.out.println("Adhar "+user.getAdharNo());
        System.out.println("Occupation "+user.getOccupation());
        System.out.println("Password "+user.getPassword());
        System.out.println("confirm password: "+user.getConPassword());
        System.out.println("state"+user.getState());
        System.out.println("qualification: "+user.getQualification());
        System.out.println("Pincode "+user.getPassword());
    }
}
