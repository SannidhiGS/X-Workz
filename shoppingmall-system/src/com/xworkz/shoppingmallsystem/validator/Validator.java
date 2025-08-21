package com.xworkz.shoppingmallsystem.validator;

import com.xworkz.shoppingmallsystem.shop.Shop;

public class Validator {
    public boolean getShopValidation(Shop shop){
        boolean isShopId=false;
        if(shop.getShopId()>0)
            isShopId=true;
        else
            System.out.println("The Shop ID is not valid");

        boolean isShopName=false;
        if(shop.getShopName()!=null && !shop.getShopName().isEmpty())
            isShopName=true;
        else
            System.out.println("The Shop Name is not valid");

        boolean isCategory=false;
        if(shop.getCategory()!=null && !shop.getCategory().isEmpty())
            isCategory=true;
        else
            System.out.println("The Category is not valid");

        boolean isOwnerName=false;
        if(shop.getOwnerName()!=null && !shop.getOwnerName().isEmpty())
            isOwnerName=true;
        else
            System.out.println("The Owner Name is not valid");

        boolean isContactNumber=false;
        if(shop.getContactNumber()!=null && !shop.getContactNumber().isEmpty())
            isContactNumber=true;
        else
            System.out.println("The Contact Number is not valid");

        boolean getDetails=false;
        if(isShopId && isShopName && isCategory && isOwnerName && isContactNumber)
            getDetails=true;
        else
            System.out.println("The Shop information is not valid");

        return getDetails;
    }
}
