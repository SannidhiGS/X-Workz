class Army {

    String armyName;
    int armyStrength;

    Squad squad;

    Army(String armyName, int armyStrength, Squad squad) {
        this.armyName = armyName;
        this.armyStrength = armyStrength;
        this.squad = squad;
    }

    public void getArmyDetails() {
        System.out.println("Army Name: " + armyName);
        System.out.println("Army Strength: " + armyStrength);
        this.squad.getSquadDetails();
    }
}
