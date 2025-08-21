public class Flower {
    String name;
    String color;
    String originCountry;
    String bloomingSeason;
    boolean isFragrant;
    int numberOfPetals;

    // Default constructor
    Flower() {
    }

    // Constructor with name
    Flower(String name) {
        this.name = name;
    }

    // Constructor with color and fragrance
    Flower(String color, boolean isFragrant) {
        this.color = color;
        this.isFragrant = isFragrant;
    }

    // Constructor with name, season, and number of petals
    Flower(String name, String bloomingSeason, int numberOfPetals) {
        this.name = name;
        this.bloomingSeason = bloomingSeason;
        this.numberOfPetals = numberOfPetals;
    }

    // Constructor with origin country
    Flower(String originCountry, int dummy) { // Dummy int to avoid overload conflict
        this.originCountry = originCountry;
    }

    // Display flower info
    void getFlowerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Origin Country: " + originCountry);
        System.out.println("Blooming Season: " + bloomingSeason);
        System.out.println("Is Fragrant: " + isFragrant);
        System.out.println("Number of Petals: " + numberOfPetals);
        System.out.println();
    }
}
