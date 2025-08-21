package com.xworkz.amazon.amazonsystem;

import com.xworkz.amazon.product.Product;
import com.xworkz.amazon.validator.Validator;

public class Amazon {
    Product product;

    public boolean getProductInfo( Product product){
        boolean getProductInfo=false;
        Validator validator=new Validator();
        boolean data=validator.getValidateProduct(product);
        if(data){
            this.product=product;
            getProductInfo=true;
        }
        else
            System.out.println("The product is not valid");
        return getProductInfo;
    }

    public void getProductData(){
        System.out.println("The product Id: "+product.getProductId());
        System.out.println("The product name: "+product.getProductName());
        System.out.println("The price: "+product.getPrice());
        System.out.println("The category: "+product.getCategory());
        System.out.println("The rating "+product.getRating());
    }
    public boolean getUpdateProduct(Double price){
        boolean isValueUpdated=false;
        if(price>0){
            product.setPrice(price);
            isValueUpdated=true;
        }
        return isValueUpdated;
    }

}
