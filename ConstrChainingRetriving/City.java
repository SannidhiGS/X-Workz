class City {
    String cityName;
    int population;
    boolean isCapital;

    City(String cityName, int population, boolean isCapital) {
        this.cityName = cityName;
        this.population = population;
        this.isCapital = isCapital;
    }

    void getCityDetails() {
        System.out.println("City Name: " + cityName);
        System.out.println("Population: " + population);
        System.out.println("Is Capital: " + isCapital);
    }
}