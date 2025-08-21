package com.xworkz.watchshopsystem.watchshop;

import com.xworkz.watchshopsystem.watch.Watch;
import com.xworkz.watchshopsystem.validator.Validator;

public class WatchShop {
    Watch watch;

    public boolean getWatchInfo(Watch watch){
        boolean getWatchInfo=false;
        Validator validator=new Validator();

        boolean data=validator.getWatchValidation(watch);
        if(data){
            this.watch=watch;
            getWatchInfo=true;
        }
        else
            System.out.println("Validation info not true");
        return getWatchInfo;
    }

    public void getWatchDetails(){
        System.out.println("The Watch ID: "+watch.getWatchId());
        System.out.println("The Brand: "+watch.getBrand());
        System.out.println("The Model: "+watch.getModel());
        System.out.println("The Price: "+watch.getPrice());
        System.out.println("The Type: "+watch.getType());
    }
}
