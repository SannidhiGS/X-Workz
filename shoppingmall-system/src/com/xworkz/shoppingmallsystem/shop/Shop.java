package com.xworkz.shoppingmallsystem.shop;

public class Shop {
    private int shopId;
    public void setShopId(int shopId){
        this.shopId=shopId;
    }
    public int getShopId(){
        return shopId;
    }

    private String shopName;
    public void setShopName(String shopName){
        this.shopName=shopName;
    }
    public String getShopName(){
        return shopName;
    }

    private String category; // e.g., Clothing, Electronics, Food
    public void setCategory(String category){
        this.category=category;
    }
    public String getCategory(){
        return category;
    }

    private String ownerName;
    public void setOwnerName(String ownerName){
        this.ownerName=ownerName;
    }
    public String getOwnerName(){
        return ownerName;
    }

    private String contactNumber;
    public void setContactNumber(String contactNumber){
        this.contactNumber=contactNumber;
    }
    public String getContactNumber(){
        return contactNumber;
    }
}
