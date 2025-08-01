class GalaxyRunner {
    public static void main(String[] args) {
        Planet planet = new Planet("Earth", 6371, true);
        SolarSystem solarSystem = new SolarSystem("Solar System", 8, planet);
        Galaxy galaxy = new Galaxy("Milky Way", "Spiral", solarSystem);
        galaxy.getGalaxyDetails();
    }
}