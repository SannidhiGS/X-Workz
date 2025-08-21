package com.bank.coin;

public class Coin {

    int id;
    String govtName;
    String year;

    public void setId(int id) {
        this.id = id;
    }
    int getId(){
        return id;
    }
    public void setGovtName(String govtName){
        this.govtName=govtName;
    }
    String getGovtName()
    {
        return govtName;
    }
    public void setYear(String year) {
        this.year = year;
    }
    String getYear(){
        return year;
    }

    void getCoin(){
        System.out.println("ID: "+id);
        System.out.println("Government Name: "+govtName);
        System.out.println("Year"+year);
    }
}
