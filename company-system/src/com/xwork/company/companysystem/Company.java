package com.xwork.company.companysystem;

import com.xwork.company.project.Project;
import com.xwork.company.validator.Validator;

public class Company {
    Project project;
    public boolean getProjectInfo(Project project){
        Validator validator=new Validator();
        boolean getProjectInfo=false;
        boolean data=validator.getProjectValidation(this.project);
        if(data){
            getProjectInfo=true;
            this.project=project;
        }
        else{
            System.out.println("The name not valid");
        }
        return getProjectInfo;
    }
    public void getProjectData(){
        System.out.println("The project ID: "+project.getProjectId());
        System.out.println("The project name: "+project.getProjectName());
        System.out.println("The project start date: "+project.getStartDate());
        System.out.println("the project end date: "+project.getEndDate());
        System.out.println("The project budget: "+project.getBudget());
    }

}
