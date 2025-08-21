package com.xwork.company.validator;

import com.xwork.company.project.Project;

public class Validator {
    Project project;
    public boolean getProjectValidation(Project project){

        boolean isProjectId = false;
        if(project.getProjectId()!=0 && project.getProjectId()>0){
            isProjectId=true;
        }
        else{
            System.out.println("The project id not valid");
        }

        boolean isProjectName = false;
        if(project.getProjectName()!=null && !project.getProjectName().isEmpty()){
            isProjectName=true;
        }
        else{
            System.out.println("The project name not valid");
        }

        boolean isStartDate = false;
        if(project.getStartDate()!=null && !project.getStartDate().isEmpty()){
            isStartDate=true;
        }
        else {
            System.out.println("The name not registered");
        }
        boolean isEndDate = false;
        if(project.getEndDate()!=null && !project.getEndDate().isEmpty())
            isEndDate=true;
        else
            System.out.println("The end date is not valid");
        boolean isBudget = false;
        if(project.getBudget()!=0 && project.getBudget()>0){
            isBudget=true;
        }
        else {
            System.out.println("The budget not valid");
        }

        boolean getProjectValidation=false;
        if(isProjectId && isProjectName && isStartDate && isEndDate && isBudget){
            getProjectValidation=true;
        }
        else
            System.out.println("The project not valid");
        return getProjectValidation;
    }



}
