package com.xworkz.loksabhasystem.loksabha;

import com.xworkz.loksabhasystem.politician.Politician;
import com.xworkz.loksabhasystem.validator.Validator;

public class LokSabha {
    private Politician politician;
    private Validator validator = new Validator();

    public void setPolitician(Politician politician) {
        if (validator.validate(politician)) {
            this.politician = politician;
            System.out.println("Politician data accepted and stored in LokSabha.");
        } else {
            System.out.println("Politician data is invalid, not stored.");
        }
    }

    public boolean getPoliticianData() {
        if (politician != null) {
            System.out.println("=== Politician Details ===");
            System.out.println("ID: " + politician.getPoliticianId());
            System.out.println("Name: " + politician.getPoliticianName());
            System.out.println("Party: " + politician.getPartyName());
            System.out.println("Constituency: " + politician.getConstituency());
            System.out.println("Age: " + politician.getAge());
            System.out.println("State: " + politician.getState());
            return true;
        } else {
            System.out.println("No valid politician data available.");
            return false;
        }
    }
}
