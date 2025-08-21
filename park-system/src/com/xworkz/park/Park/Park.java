package com.xworkz.park.Park;

public class Park{

    private int parkId;

    public int getParkId(){
        return parkId;
    }

    public void setParkId(int parkId){
       this.parkId=parkId;
    }

    private String parkName;

    public String getParkName(){
        return parkName;
    }
    public void setParkName(String parkName){
        this.parkName=parkName;
    }

    private int noOfBreed;

    public void setNoOfBreed(int noOfBreed){
        this.noOfBreed=noOfBreed;
    }

    public int getNoOfBreed(){
        return noOfBreed;
    }
}
