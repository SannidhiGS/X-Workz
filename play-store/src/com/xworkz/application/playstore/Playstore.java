package com.xworkz.application.playstore;

import com.xworkz.application.app.App;
import com.xworkz.application.validator.Validator;

public class Playstore{
   App app;

    public  boolean addAppValidator(App app){
        Validator validator = new Validator();
       // boolean getAppValid = validator.getAppValidate(app);

        boolean addAppValidator=false;
        boolean getAppValid=false;

        getAppValid=Validator.getAppValidate(app);

        if(getAppValid){
            this.app = app;
            addAppValidator = true;
        }

        else{
            System.out.println("App not valid");
        }
       return addAppValidator;
    }
    public  void getAppData(){
        System.out.println("The App ID: "+app.getAppId());
        System.out.println("The App name: "+app.getAppName());
        System.out.println("The App version is: "+app.getVersion());
        System.out.println("The updated size: "+app.getUpdateSize());
        System.out.println("The required os: "+app.getRequiredOs());
        System.out.print("The Offered by: "+app.getOfferedBy());
    }
}
