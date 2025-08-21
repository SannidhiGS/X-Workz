package com.xworkz.lokasabhasystem;

import com.xworkz.loksabhasystem.politician.Politician;
import com.xworkz.loksabhasystem.loksabha.LokSabha;

public class LokSabhaRunner {
    public static void main(String[] args) {
        Politician politician = new Politician();
        politician.setPoliticianId(101);
        politician.setPoliticianName("Rahul Sharma");
        politician.setPartyName("National Party");
        politician.setConstituency("Bangalore South");
        politician.setAge(48);
        politician.setState("Karnataka");

        LokSabha lokSabha = new LokSabha();
        lokSabha.setPolitician(politician);

        boolean details = lokSabha.getPoliticianData();
        System.out.println("Data Retrieved: " + details);
    }
}
