package com.xworkz.loksabhasystem.politician;

public class Politician {
    private int politicianId;
    private String politicianName;
    private String partyName;
    private String constituency;
    private int age;
    private String state;

    // Setters
    public void setPoliticianId(int politicianId) {
        this.politicianId = politicianId;
    }

    public void setPoliticianName(String politicianName) {
        this.politicianName = politicianName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setState(String state) {
        this.state = state;
    }

    // Getters
    public int getPoliticianId() {
        return politicianId;
    }

    public String getPoliticianName() {
        return politicianName;
    }

    public String getPartyName() {
        return partyName;
    }

    public String getConstituency() {
        return constituency;
    }

    public int getAge() {
        return age;
    }

    public String getState() {
        return state;
    }
}
