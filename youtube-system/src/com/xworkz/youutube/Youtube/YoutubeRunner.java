package com.xworkz.youutube;
import com.xworkz.youutube.Youtube.Youtube;

public class YoutubeRunner {
    public static void main(String args[]){
        System.out.println("The main started");

        Youtube youtube=new Youtube();

        youtube.setName("Code With Harry");
        youtube.setNoOfSubscribers(8.9);
        youtube.setChanelType("Educational");

        System.out.println("The chanel name: "+youtube.getName());
        System.out.println("The no of subcribers in M "+youtube.getNoOfSubscribers());
        System.out.println("The chanel type: "+youtube.getChanelType());
    }
}
