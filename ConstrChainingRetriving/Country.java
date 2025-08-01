class Country {
    String countryName;
    String president;
    State state;

    Country(String countryName, String president, State state) {
        this.countryName = countryName;
        this.president = president;
        this.state = state;
    }

    void getCountryDetails() {
        System.out.println("Country Name: " + countryName);
        System.out.println("President: " + president);
        state.getStateDetails();
    }
}