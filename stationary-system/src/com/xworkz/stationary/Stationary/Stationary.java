package com.xworkz.stationary.Stationary;

public class Stationary {

    private int noOfItems;

    public int getNoOfItems(){
        return noOfItems;
    }
    public void setNoOfItems(int noOfItems){
        this.noOfItems=noOfItems;
    }

    private String brandName;

    public String getBrandName(){
        return brandName;
    }
    public void setBrandName(String brandName){
        this.brandName=brandName;
    }

    private double price;

    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
}
