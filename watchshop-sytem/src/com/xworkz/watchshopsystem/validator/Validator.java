package com.xworkz.watchshopsystem.validator;

import com.xworkz.watchshopsystem.watch.Watch;

public class Validator {
    public boolean getWatchValidation(Watch watch){
        boolean isWatchId=false;
        if(watch.getWatchId()>0)
            isWatchId=true;
        else
            System.out.println("The Watch ID is not valid");

        boolean isBrand=false;
        if(watch.getBrand()!=null && !watch.getBrand().isEmpty())
            isBrand=true;
        else
            System.out.println("The Brand is not valid");

        boolean isModel=false;
        if(watch.getModel()!=null && !watch.getModel().isEmpty())
            isModel=true;
        else
            System.out.println("The Model is not valid");

        boolean isPrice=false;
        if(watch.getPrice()>0)
            isPrice=true;
        else
            System.out.println("The Price is not valid");

        boolean isType=false;
        if(watch.getType()!=null && !watch.getType().isEmpty())
            isType=true;
        else
            System.out.println("The Type is not valid");

        boolean getDetails=false;
        if(isWatchId && isBrand && isModel && isPrice && isType)
            getDetails=true;
        else
            System.out.println("The Watch information is not valid");

        return getDetails;
    }
}
