package com.xworkz.networkapp;

import com.xworkz.networkapp.airtel.Airtel;
import sun.awt.geom.AreaOp;

public class AirtelRunner {
    public static void main(String args[]){
        Airtel airtel=new Airtel();

        airtel.netWorkId=12;
        airtel.networkName="Airtel123";
        airtel.networkRange=120.5;

        System.out.println("The network ID "+airtel.netWorkId);
        System.out.println("The network name: "+airtel.networkName);
        System.out.println("The network range: "+airtel.networkRange);
    }
}
