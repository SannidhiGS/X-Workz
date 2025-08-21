package com.xworkz.shoppingmallsystem.shoppingmall;

import com.xworkz.shoppingmallsystem.shop.Shop;
import com.xworkz.shoppingmallsystem.validator.Validator;

public class ShoppingMall {
    Shop shop;

    public boolean getShopInfo(Shop shop){
        boolean getShopInfo=false;
        Validator validator=new Validator();

        boolean data=validator.getShopValidation(shop);
        if(data){
            this.shop=shop;
            getShopInfo=true;
        }
        else
            System.out.println("Validation info not true");
        return getShopInfo;
    }

    public void getShopDetails(){
        System.out.println("The Shop ID: "+shop.getShopId());
        System.out.println("The Shop Name: "+shop.getShopName());
        System.out.println("The Category: "+shop.getCategory());
        System.out.println("The Owner Name: "+shop.getOwnerName());
        System.out.println("The Contact Number: "+shop.getContactNumber());
    }
}
