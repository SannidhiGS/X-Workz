package com.xworkz.wireapp.wire;


public class Wire {

    int wireId;
    String brandName;
    int wireLen;
    String wireColor;
    double wirePrice;


    public void setWireId(int wireId){
        this.wireId=wireId;
    }
    int getWireId(){
        return wireId;
    }

    public void setBrandName(String brandName){
        this.brandName=brandName;
    }
    String getBrandName(){
        return brandName;
    }

    public void setWireLen(int wireLen){
        this.wireLen=wireLen;
    }
    int getWireLen(){
        return wireLen;
    }
    public void setWireColor(String color){
        this.wireColor=wireColor;
    }
    public void setWirePrice(double wirePrice){
        this.wirePrice=wirePrice;
    }
    double getWirePrice(){
        return wirePrice;
    }
    public void getWireDetails(){
        System.out.println("The wire ID :"+wireId);
        System.out.println("The brand name: "+brandName);
        System.out.println("The wire length: "+wireLen);
        System.out.println("The color of the wire: "+wireColor);
        System.out.println("The wire price: "+wirePrice);
    }
}
