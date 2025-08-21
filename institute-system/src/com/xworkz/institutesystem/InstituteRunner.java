package com.xworkz.institutesystem;

import com.xworkz.institutesystem.institute.Institute;
import com.xworkz.institutesystem.trainee.Trainee;

public class InstituteRunner {
    public static  void main(String args[]){
        Trainee trainee=new Trainee();

        trainee.setTraineeId(12);
        trainee.setTraineeName("Sannidhi G S");
        trainee.setAge(22);
        trainee.setBatchTiming("9-12");
        trainee.setCourseEnrolled("Core Java");

        Institute institute=new Institute();
        boolean data=institute.getTraineeInfo(trainee);
        if(data){
            institute.getTraineeData();
        }
        else
            System.out.println("The trainee not enrolled");
    }
}
