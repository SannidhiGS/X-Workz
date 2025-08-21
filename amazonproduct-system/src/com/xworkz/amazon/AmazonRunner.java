package com.xworkz.amazon;

import com.xworkz.amazon.amazonsystem.Amazon;
import com.xworkz.amazon.product.Product;
import com.xworkz.amazon.validator.Validator;

public class AmazonRunner {
    public static void main(String[] args){
        Product product=new Product();

        product.setProductId("am123");
        product.setProductName("Hair Straightner");
        product.setPrice(3000);
        product.setCategory("Girls Shopping");
        product.setRating(4.5);

        Amazon amazon=new Amazon();
        boolean data=amazon.getProductInfo(product);
        if(data){
            amazon.getProductData();
        }
        amazon.getUpdateProduct(12.00);
        amazon.getProductData();

//        else
//            System.out.println("The product not valid");
    }
}
