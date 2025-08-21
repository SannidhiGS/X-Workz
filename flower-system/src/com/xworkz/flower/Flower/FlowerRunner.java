package com.xworkz.flower;

import com.xworkz.flower.Flower.Flower;

public class FlowerRunner {

    public static void main(String args[]){
        System.out.println("Main Started");

        Flower flower=new Flower();
        flower.setName("Jasmine");
        flower.setColor("white");
        flower.setSpecies("flora");

        System.out.println("Name: "+flower.getName());
        System.out.println("Color: "+flower.getColor());
        System.out.println("Species: "+flower.getSpecies());
    }
}
