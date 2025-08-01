class Squad {

    String squadName;
    int numberOfSoldiers;

    Squad(String squadName, int numberOfSoldiers) {
        this.squadName = squadName;
        this.numberOfSoldiers = numberOfSoldiers;
    }

    public void getSquadDetails() {
        System.out.println("Squad Name: " + squadName);
        System.out.println("Number of Soldiers: " + numberOfSoldiers);
    }
}