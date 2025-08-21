package com.xworkz.shoppingmallsystem;

import com.xworkz.shoppingmallsystem.shop.Shop;
import com.xworkz.shoppingmallsystem.shoppingmall.ShoppingMall;

public class ShoppingMallRunner {
    public static void main(String args[]){
        Shop shop=new Shop();

        shop.setShopId(2001);
        shop.setShopName("Trends");
        shop.setCategory("Clothing");
        shop.setOwnerName("Ramesh Kumar");
        shop.setContactNumber("9876543210");

        ShoppingMall mall=new ShoppingMall();
        boolean data=mall.getShopInfo(shop);
        if(data){
            mall.getShopDetails();
        }
        else
            System.out.println("The Shop Info not valid");
    }
}
