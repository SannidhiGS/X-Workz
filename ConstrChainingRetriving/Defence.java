class Defence {

    int defenceCode;
    String defenceName;
    int totalArmies;

    Army army;

    Defence(int defenceCode, String defenceName, int totalArmies, Army army) {
        this.defenceCode = defenceCode;
        this.defenceName = defenceName;
        this.totalArmies = totalArmies;
        this.army = army;
    }

    public void getDefenceDetails() {
        System.out.println("Defence Code: " + defenceCode);
        System.out.println("Defence Name: " + defenceName);
        System.out.println("Total Armies: " + totalArmies);
        this.army.getArmyDetails();
    }
}