package com.xworkz.amazon.validator;

import com.xworkz.amazon.product.Product;

public class Validator {
    Product product;

    public boolean getValidateProduct(Product product){
        boolean isIdValid=false;
        if(product.getProductId()!=null && !product.getProductId().isEmpty())
            isIdValid=true;
        else
            System.out.println("The user Id not Valid");

        boolean isNameValid=false;
        if(product.getProductName()!=null && !product.getProductName().isEmpty())
            isNameValid=true;
        else
            System.out.println("The name not valid");

        boolean isPriceValid=false;
        if(product.getPrice()!=0 && product.getPrice()>0)
            isPriceValid=true;
        else
            System.out.println("The price is not valid");

        boolean isCategoryValid=false;
        if(product.getCategory()!=null && !product.getCategory().isEmpty())
            isCategoryValid=true;
        else
            System.out.println("There is no valid category");

        boolean isRatingValid=false;
        if(product.getRating()!=0 && product.getRating()>0)
            isRatingValid=true;
        else
            System.out.println("There is rating not valid");
        boolean getValidateProduct=false;
        if(isIdValid && isNameValid && isPriceValid && isCategoryValid && isRatingValid)
            getValidateProduct=true;
        else
            System.out.println("The product detail not valid");
        return getValidateProduct;
    }


}
