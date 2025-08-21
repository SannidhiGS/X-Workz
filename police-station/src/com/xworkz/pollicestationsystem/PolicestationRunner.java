package com.xworkz.pollicestationsystem;

import com.xworkz.pollicestationsystem.police.Police;
import com.xworkz.pollicestationsystem.policestation.Policestation;

public class PolicestationRunner {
    public static void main(String args[]){
        Police police=new Police();

        police.setPoliceId(12);
        police.setPoliceName("Soorya Narayana");
        police.setRank("AIR12");
        police.setDutyArea("Banglore");
        police.setContactNumber("95457898789");

        Policestation policestation=new Policestation();
        boolean data=policestation.getPoliceInfo(police);
        if(data){
            policestation.getPoliceDetails();
        }
        else
            System.out.println("The police Info not valid");

    }
}
