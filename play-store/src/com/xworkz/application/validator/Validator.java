package com.xworkz.application.validator;

import com.xworkz.application.app.App;

public class Validator {
    App app;

    public static boolean getAppValidate(App app){
        boolean isAppIdValid=false;
        if(app.getAppId()!=0 && app.getAppId()>0){
            isAppIdValid=true;
        }
        else{
            System.out.println("Invalid app Id");
        }
        boolean isAppNameValid=false;
        if(app.getAppName()!=null && !app.getAppName().isEmpty()){
            isAppNameValid=true;
        }
        else{
            System.out.println("The name not valid");
        }
        boolean isAppVersionValid=false;
        if(app.getVersion()!=null && !app.getVersion().isEmpty()){
            isAppVersionValid=true;
        }
        else
            System.out.println("The version not valid");
        boolean isAppUpdateValid=false;
        if (app.getUpdateSize()!=0 && app.getUpdateSize()>0){
            isAppUpdateValid=true;
        }
        else
            System.out.println("not updated");
        boolean isRequiredOsValid=false;
        if(app.getRequiredOs()!=null && !app.getRequiredOs().isEmpty()){
            isRequiredOsValid=true;
        }
        else
            System.out.println("The required not satisfied");
        boolean isOfferedByValid=false;
        if(app.getOfferedBy()!=null && !app.getOfferedBy().isEmpty()){
            isOfferedByValid=true;
        }
        else
            System.out.println("not valid");

        boolean getAppValidate = false;
        if(isAppIdValid && isAppNameValid && isAppVersionValid && isAppUpdateValid && isRequiredOsValid && isOfferedByValid){
            getAppValidate=true;

        }
        else{
            System.out.println("The user not validated");
        }
        return getAppValidate;
    }
}
