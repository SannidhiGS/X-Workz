package com.xworkz.application.app;

public class App {
    private int appId;
    private String appName;
    private String version;
    private double updateSize;
    private  String requiredOs;
    private String offeredBy;

    public void setAppId(int appId){
        this.appId=appId;
    }

    public int getAppId(){
        return appId;
    }

    public void setAppName(String appName){
        this.appName=appName;
    }
    public String getAppName(){
        return appName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public double getUpdateSize() {
        return updateSize;
    }

    public void setUpdateSize(double updateSize) {
        this.updateSize = updateSize;
    }

    public String getRequiredOs() {
        return requiredOs;
    }

    public void setOfferedBy(String offeredBy) {
             this.offeredBy = offeredBy;
    }

    public String getOfferedBy() {
        return offeredBy;
    }

    public void setRequiredOs(String requiredOs) {
        this.requiredOs = requiredOs;
    }
}
