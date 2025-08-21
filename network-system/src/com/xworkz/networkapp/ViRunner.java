package com.xworkz.networkapp;
import  com.xworkz.networkapp.vi.Vi;
public class ViRunner {
    public static void main(String arg[]){
        Vi vi=new Vi();
        vi.networkId=15;
        vi.networkName="Vi@123";
        vi.networkRange=180;

        System.out.println("The network ID: "+vi.networkId);
        System.out.println("The network name:"+vi.networkName);
        System.out.println("The network range: "+vi.networkRange);

    }
}
