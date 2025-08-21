package com.xworkz.tv.Telivision;

public class News {

    private double newsChanelRating;

    public void setNewChanelRating(double newChanelRating){
        this.newsChanelRating=newsChanelRating;
    }
    public double getNewChanelRating(){
        return newsChanelRating;
    }

    private String newsChanelName;

    public void setNewsChanelName(String newsChanelName){
        this.newsChanelName=newsChanelName;
    }
    public String getNewsChanelName(){
        return newsChanelName;
    }

    private boolean isHonest;
    public boolean getIsHonest(){
        return isHonest;
    }
    public void setIsHonest(boolean isHonest){
        this.isHonest=isHonest;
    }
}
