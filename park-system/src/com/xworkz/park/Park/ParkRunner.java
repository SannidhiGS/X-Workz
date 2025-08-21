package com.xworkz.park;

import com.xworkz.park.Park.Park;
public class ParkRunner {
    public static void main(String args[]){
        System.out.println("Main started");

        Park park=new Park();

        park.setParkId(12);
        park.setParkName("Lal Bagh Botonical Garden");
       park.setNoOfBreed(1098);

       System.out.println("The park id: "+park.getParkId());
       System.out.println("The park name: "+park.getParkName());
       System.out.print("The number of breeds: "+park.getNoOfBreed());
    }
}
