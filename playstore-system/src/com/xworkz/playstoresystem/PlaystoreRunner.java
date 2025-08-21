package com.xworkz.playstoresystem;

import com.xworkz.playstoresystem.playstore.PlayStore;
import com.xworkz.playstoresystem.user.User;

public class PlaystoreRunner {
    public static void main(String args[]){
        User user=new User();

        user.setName("Sannidhi");
        user.setSurName("Shetty");
        user.setDob("25-02-2003");
        user.setAddress("Thirthahalli");
        user.setContactNo("9535812585");
        user.setAge(12);
        user.setFatherName("Sharashchandra");
        user.setMotherName("Vinodha");
        user.setAdharNo("1325-7868-8987");
        user.setState("Karnataka");
        user.setOccupation("trainee");
        user.setPassword("Sannishetty777");
        user.setConPassword("Sannishetty777");
        user.setQualification("B.E");
        user.setPinCode("577415");

        PlayStore playStore=new PlayStore();

        boolean info=playStore.getUserData(user);

        if(info){
            playStore.getUserInfo();
        }
        else
            System.out.println("The user not registered");

    }
}
