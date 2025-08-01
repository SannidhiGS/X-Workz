class CountryRunner {
    public static void main(String[] args) {
        City city = new City("Bangalore", 8400000, true);
        State state = new State("Karnataka", "Siddaramaiah", city);
        Country country = new Country("India", "Droupadi Murmu", state);
        country.getCountryDetails();
    }
}