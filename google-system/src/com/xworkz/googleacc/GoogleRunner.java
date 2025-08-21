package com.xworkz.googleacc;

import com.xworkz.googleacc.google.Google;
import com.xworkz.googleacc.googlevalid.GoogleValid;
import javafx.scene.effect.Light;

import java.sql.SQLOutput;

public class GoogleRunner {
    public static  void main(String args[]){
        Google google=new Google();
        google.setFirstName("Sannidhi");
        google.setLastName("Shetty");
        google.setDob("25/02/2003");
        google.setGender("Female");
        google.setPhNo(9535812585L);

        GoogleValid googleValid=new GoogleValid();
        boolean data=googleValid.getValidation(google);
        if(data){
            googleValid.showInfo();
        }
        else{
            System.out.println("The user not registerd");
        }
    }
}
