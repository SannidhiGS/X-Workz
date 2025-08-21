package com.xworkz.loksabhasystem.validator;

import com.xworkz.loksabhasystem.politician.Politician;

public class Validator {

    public boolean validate(Politician politician) {
        if (politician == null) {
            System.out.println("Politician object is null.");
            return false;
        }

        if (politician.getPoliticianId() <= 0) {
            System.out.println("Invalid Politician ID.");
            return false;
        }

        if (politician.getPoliticianName() == null || politician.getPoliticianName().isEmpty()) {
            System.out.println("Politician name cannot be empty.");
            return false;
        }

        if (politician.getPartyName() == null || politician.getPartyName().isEmpty()) {
            System.out.println("Party name cannot be empty.");
            return false;
        }

        if (politician.getConstituency() == null || politician.getConstituency().isEmpty()) {
            System.out.println("Constituency cannot be empty.");
            return false;
        }

        if (politician.getAge() < 25) {
            System.out.println("Age must be at least 25 to become an MP.");
            return false;
        }

        if (politician.getState() == null || politician.getState().isEmpty()) {
            System.out.println("State cannot be empty.");
            return false;
        }

        return true;
    }
}
