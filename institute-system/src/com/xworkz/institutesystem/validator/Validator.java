package com.xworkz.institutesystem.validator;

import com.xworkz.institutesystem.trainee.Trainee;

public class Validator {
    Trainee trainee;
    public boolean getValidate( Trainee trainee){
        boolean isIdValid=false;
        if(trainee.getTraineeId()>0)
            isIdValid=true;
        else
            System.out.println("ID not valid");

        boolean isName=false;
        if(trainee.getTraineeName()!=null && !trainee.getTraineeName().isEmpty())
            isName=true;
        else
            System.out.println("The name not valid");

        boolean isAge=false;
        if(trainee.getAge()!=0 && trainee.getAge()>0)
            isAge=true;
        else
            System.out.println("The age is not valid");

        boolean isBatchTime=false;
        if(trainee.getBatchTiming()!=null && !trainee.getBatchTiming().isEmpty())
            isBatchTime=true;
        else
            System.out.println("The batch time not valid");

        boolean isCourseEnrolled=false;
        if(trainee.getCourseEnrolled()!=null && !trainee.getCourseEnrolled().isEmpty())
            isCourseEnrolled=true;
        else
            System.out.println("The course not registered");

        boolean getValidate=false;
        if(isIdValid && isName && isAge && isBatchTime && isCourseEnrolled)
            getValidate=true;
        else
            System.out.println("The name is not valid");
        return getValidate;
    }
}
