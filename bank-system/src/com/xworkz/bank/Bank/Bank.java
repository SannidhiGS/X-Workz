package com.xworkz.bank.Bank;
public class Bank {
    private String bankName;
    public String getBankName(){
        return bankName;
    }
    public void setBankName(String bankName){
        this.bankName=bankName;
    }

    private int branch;
    public int getBranch()
    {
        return branch;
    }
    public void setBranch(int branch){
        this.branch=branch;
    }

    private String location;

    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location=location;
    }
}
