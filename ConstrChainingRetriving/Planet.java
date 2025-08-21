class Planet {
    String planetName;
    double size;
    boolean hasLife;

    Planet(String planetName, double size, boolean hasLife) {
        this.planetName = planetName;
        this.size = size;
        this.hasLife = hasLife;
    }

    void getPlanetDetails() {
        System.out.println("Planet Name: " + planetName);
        System.out.println("Size: " + size + " km radius");
        System.out.println("Has Life: " + hasLife);
    }
}