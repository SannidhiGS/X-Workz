package com.xworkz.amazonapp.amazon;

public class Amazon {
    private String firstname;
    private String lastName;
    private String dob;
    private String gender;
    private String phNo;
    private String password;
    private String conpassword;
    private String address;
    private int age;

    public void setFirstname(String firstname){
        this.firstname=firstname;
    }
    public String getFirstname(){
        return firstname;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public  String getLastName(){
        return lastName;
    }

    public void setDob(String dob){
        this.dob=dob;
    }
    public String getDob(){
        return dob;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }
    public void setPhNo(String phNo){
        this.phNo=phNo;
    }
    public String getPhNo(){
        return phNo;
    }
    public void setPassword(String s){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
    public void setConpassword(String s){
        this.conpassword=conpassword;
    }
    public String getConpassword(){
        return conpassword;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}

