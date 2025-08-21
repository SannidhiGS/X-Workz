package com.xworkz.youutube.Youtube;

public class Youtube {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    private double noOfSubscribers;

    public double getNoOfSubscribers(){
        return noOfSubscribers;
    }
    public void setNoOfSubscribers(double noOfSubscribers){
        this.noOfSubscribers=noOfSubscribers;
    }
    private String chanelType;
    public String getChanelType(){
        return chanelType;
    }
    public void setChanelType(String chanelType){
        this.chanelType=chanelType;
    }
}
