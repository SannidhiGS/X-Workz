package com.xworkz.watchshopsystem.watch;

public class Watch {
    private int watchId;
    public void setWatchId(int watchId){
        this.watchId=watchId;
    }
    public int getWatchId(){
        return watchId;
    }

    private String brand;
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }

    private String model;
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }

    private double price;
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }

    private String type; // e.g., Analog, Digital, Smart
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }
}
