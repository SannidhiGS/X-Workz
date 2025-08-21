package com.xworkz.wireapp.wire;
public class WireRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Wire wire=new Wire();
        wire.wireId=12;
        wire.brandName="pigeon";
        wire.wireLen=125;
        wire.wireColor="red";
        wire.wirePrice=120.0;
        wire.getWireDetails();
        System.out.println("Main Ended");
    }
}
