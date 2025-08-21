package com.xworkz.googleacc.googlevalid;
import com.xworkz.googleacc.google.Google;
public class GoogleValid {
    Google google;

    public GoogleValid() {
    }

    public boolean getValidation( Google google){
        boolean getValidation=false;
        boolean isFirstNameValid=false;
        boolean isLastNameValid=false;
        boolean isGenderValid = false;
        boolean isDobValid=false;
        boolean isPhnoValid=false;


        if(google.getFirstName()!=null){
            isFirstNameValid=true;
        }
        else{
            System.out.println("Provide the proper first name: ");
        }
        if(google.getLastName()!=null){
            isLastNameValid=true;
        }
        else{
            System.out.println("Provide the proper last name: ");
        }
        if(google.getGender()!=null){
            isGenderValid=true;
        }
        else{
            System.out.println("Select the proper gender");
        }
        if(google.getDob()!=null){
            isDobValid=true;
        }
        else{
            System.out.println("Enter the correct Date of Birth");
        }
        if(google.getPhNo()!=0){
            isPhnoValid=true;
        }
        else{
            System.out.println("Enter the valid phone number");
        }
        if(isFirstNameValid && isLastNameValid && isGenderValid && isDobValid && isPhnoValid) {
            getValidation = true;
            this.google = google;
        }
        return getValidation;
    }
    public void showInfo(){
        System.out.println("First name: "+google.getFirstName());
        System.out.println("Last Name: "+google.getLastName());
        System.out.println("DOB: "+google.getDob());
        System.out.println("Gender: "+google.getGender());
        System.out.println("Ph no: "+google.getPhNo());
    }
}
