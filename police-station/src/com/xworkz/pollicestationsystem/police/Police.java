package com.xworkz.pollicestationsystem.police;

public class Police {
    private int policeId;
    public void setPoliceId(int policeId){
        this.policeId=policeId;
    }
    public int getPoliceId(){
        return policeId;
    }

    private String policeName;
    public void setPoliceName(String policeName){
        this.policeName=policeName;
    }
    public String getPoliceName(){
        return policeName;
    }

    private String rank;
    public void setRank(String rank){
        this.rank=rank;
    }
    public String getRank(){
        return rank;
    }

    private String dutyArea;
    public void setDutyArea(String dutyArea){
        this.dutyArea=dutyArea;
    }
    public String getDutyArea(){
        return dutyArea;
    }

    private String contactNumber;
    public void setContactNumber(String contactNumber){
        this.contactNumber=contactNumber;
    }
    public String getContactNumber(){
        return contactNumber;
    }
}
