package com.xworkz.amazonapp.valid;
import com.xworkz.amazonapp.amazon.Amazon;

import java.util.Objects;

public class AmazonValid {
    Amazon amazon;

    public boolean getAmazonValid(Amazon amazon) {
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isDobValid = false;
        boolean isGenderValid = false;
        boolean isPhnoValid = false;
        boolean isPasswordValid = false;
        boolean isconPasswordValid = false;
        boolean isAddressValid = false;
        boolean isAgeValid = false;

        boolean getAmazonValid = false;

        if (amazon.getFirstname() != null) {
            isFirstNameValid = true;
        } else {
            System.out.println("Enter the first nam:");
        }
        if (amazon.getLastName() != null) {
            isLastNameValid = true;
        } else {
            System.out.println("Enter the last name");
        }
        if (amazon.getDob() != null) {
            isDobValid = true;
        } else {
            System.out.println("Enter the valid date of birth");
        }
        if (amazon.getAddress() != null) {
            isAddressValid = true;
        } else {
            System.out.println("Enter the valid address");
        }
        if (amazon.getPhNo() != null) {
            isPhnoValid = true;
        } else {
            System.out.println("The phone num not valid");
        }
        if (amazon.getPassword() != null) {
            isPasswordValid = true;
        } else {
            System.out.println("enter correct password");
        }
        if (amazon.getConpassword() != null && Objects.equals(amazon.getConpassword(), amazon.getPassword())) {
            isconPasswordValid = true;
        } else {
            System.out.println("The password not matching");
        }
        if (amazon.getAge() != 0 && amazon.getAge() > 18) {
            isAgeValid = true;
        } else {
            System.out.println("Age should greater than 18");
        }

        if (isFirstNameValid && isLastNameValid && isPhnoValid && isGenderValid && isAddressValid && isPasswordValid && isconPasswordValid && isAddressValid) {
            getAmazonValid = true;
        } else {
            System.out.println("The user not registered");
        }
        return getAmazonValid;
    }
    public void showInfo() {
        System.out.println("First Name " + amazon.getFirstname());
        System.out.println("Last Name " + amazon.getLastName());
        System.out.println("Date of Birth: " + amazon.getDob());
        System.out.println("Gender: " + amazon.getGender());
        System.out.println("Ph no: " + amazon.getPhNo());
        System.out.println("Password: " + amazon.getPassword());
        System.out.println("Confirm Password: " + amazon.getConpassword());
        System.out.println("Address: " + amazon.getAddress());
        System.out.println("Age " + amazon.getAge());
    }
}