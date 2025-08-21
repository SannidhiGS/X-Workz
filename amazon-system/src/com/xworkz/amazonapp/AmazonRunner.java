package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.valid.AmazonValid;

public class AmazonRunner {
    public static  void main(String args[]){
        Amazon amazon=new Amazon();
        amazon.setFirstname("Sannidhi");
        amazon.setLastName("Shetty");
        amazon.setDob("12/10/2003");
        amazon.setGender("Female");
        amazon.setPhNo("9535812585");
        amazon.setPassword("Sanni@123");
        amazon.setConpassword("Sanni@123");
        amazon.setAddress("Thirthahalli");
        amazon.setAge(18);



        AmazonValid amazonValid=new AmazonValid();
        boolean result = amazonValid.getAmazonValid(amazon);
        if(result){
            amazonValid.showInfo();
        }
        else{
            System.out.println("User not Registered");
        }
    }
}
