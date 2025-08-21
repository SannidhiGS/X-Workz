package com.cadbory.choco;

public class Chocolate {

    int id;
    String brand;
    double price;

    public void setId(int id){
        this.id=id;
    }
    int getId(){
        return id;
    }
    public void setBrand( String brand){
        this.brand=brand;
    }
    String getBrand(){
        return brand;
    }
    public void setPrice( double price){
        this.price=price;
    }
    double getPrice(){
        return price;
    }

    void getChocolateDetails(){
        System.out.println("The id "+id);
        System.out.println("The brand "+brand);
        System.out.println("The price: "+price);
    }
}
