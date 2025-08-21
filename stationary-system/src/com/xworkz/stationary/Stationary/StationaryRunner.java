package com.xworkz.stationary;

import com.xworkz.stationary.Stationary.Stationary;

public class StationaryRunner {

    public static void main(String args[]){
        Stationary stationary=new Stationary();

        stationary.setNoOfItems(12);
        stationary.setBrandName("Nataraja");
        stationary.setPrice(1200);

        System.out.println("No of items: "+stationary.getNoOfItems());
        System.out.println("Brand Name: "+stationary.getBrandName());
        System.out.println("Price: "+stationary.getPrice());
    }
}
