class SolarSystem {
    String systemName;
    int numberOfPlanets;
    Planet planet;

    SolarSystem(String systemName, int numberOfPlanets, Planet planet) {
        this.systemName = systemName;
        this.numberOfPlanets = numberOfPlanets;
        this.planet = planet;
    }

    void getSolarSystemDetails() {
        System.out.println("Solar System Name: " + systemName);
        System.out.println("Number of Planets: " + numberOfPlanets);
        planet.getPlanetDetails();
    }
}