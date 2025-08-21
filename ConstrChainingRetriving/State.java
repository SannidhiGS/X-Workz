class State {
    String stateName;
    String chiefMinister;
    City city;

    State(String stateName, String chiefMinister, City city) {
        this.stateName = stateName;
        this.chiefMinister = chiefMinister;
        this.city = city;
    }

    void getStateDetails() {
        System.out.println("State Name: " + stateName);
        System.out.println("Chief Minister: " + chiefMinister);
        city.getCityDetails();
    }
}