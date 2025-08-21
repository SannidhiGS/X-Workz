package com.xworkz.institutesystem.institute;

import com.xworkz.institutesystem.trainee.Trainee;
import com.xworkz.institutesystem.validator.Validator;

public class Institute {
    Trainee trainee;

    public boolean getTraineeInfo(Trainee trainee){
        boolean getTraineeInfo=false;
        Validator validator=new Validator();
        boolean data=validator.getValidate(trainee);
        if(data){
            this.trainee=trainee;
            getTraineeInfo=true;
        }
        else
            System.out.println("The trainee data not valid");
        return getTraineeInfo;
    }
    public void getTraineeData(){
        System.out.println("The trainee id: "+trainee.getTraineeId());
        System.out.println("The trainee name: "+trainee.getTraineeName());
        System.out.println("The trainee age: "+trainee.getAge());
        System.out.println("The traine batch: "+trainee.getBatchTiming());
        System.out.println("The trainee course time: "+trainee.getCourseEnrolled());
    }

}
