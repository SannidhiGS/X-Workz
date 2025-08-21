package com.xworkz.application;

import com.xworkz.application.app.App;
import com.xworkz.application.playstore.Playstore;

public class PlaystoreRunner {
    public static void main(String args[]){
        App app=new App() ;
        app.setAppId(1098);
        app.setAppName("Zepto");
        app.setVersion("25.8.2");
        app.setUpdateSize(29.00);
        app.setRequiredOs("Android 7");
        app.setOfferedBy("Zepto private limited");

        Playstore playstore = new Playstore();
        boolean data = playstore.addAppValidator(app);

        if(data){
            playstore.getAppData();
        }
        else{
            System.out.println("The not able to download");
        }

    }
}
