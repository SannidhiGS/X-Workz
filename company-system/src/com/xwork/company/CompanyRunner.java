package com.xwork.company;

import com.xwork.company.companysystem.Company;
import com.xwork.company.project.Project;
import com.xwork.company.validator.Validator;

public class CompanyRunner {
    public static void main(String args[]){
        Project project=new Project();

        project.setProjectIdId(12);
        project.setProjectName("Even Management");
        project.setStartDate("12/3/2023");
        project.setEndDate("12/6/2023");
        project.setBudget(12000);

        Company company=new Company();
        boolean data=company.getProjectInfo(project);
        if(data)
            company.getProjectData();
        else
            System.out.println("The value not valid");
    }

}
