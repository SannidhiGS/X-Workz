package com.xworkz.watchshopsystem;

import com.xworkz.watchshopsystem.watch.Watch;
import com.xworkz.watchshopsystem.watchshop.WatchShop;

public class WatchShopRunner {
    public static void main(String args[]){
        Watch watch=new Watch();

        watch.setWatchId(101);
        watch.setBrand("Rolex");
        watch.setModel("Submariner");
        watch.setPrice(750000);
        watch.setType("Analog");

        WatchShop shop=new WatchShop();
        boolean data=shop.getWatchInfo(watch);
        if(data){
            shop.getWatchDetails();
        }
        else
            System.out.println("The Watch Info not valid");
    }
}
