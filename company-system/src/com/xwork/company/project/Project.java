package com.xwork.company.project;

public class Project {
    private int projectId;
    public void setProjectIdId(int projectId){
        this.projectId=projectId;
    }
    public int getProjectId(){
        return projectId;
    }

    private String projectName;
    public void setProjectName(String evenManagement){
        this.projectName=projectName;
    }
    public String getProjectName(){
        return projectName;
    }

    private String startDate;
    public void setStartDate(String s){
        this.startDate=startDate;
    }
    public String getStartDate(){
        return startDate;
    }

    private String endDate;
    public void setEndDate(String s){
        this.endDate=endDate;
    }
    public String getEndDate(){
        return endDate;
    }

    private double budget;
    public void setBudget(int budget){
        this.budget=budget;
    }

    public double getBudget() {
        return budget;
    }
}
