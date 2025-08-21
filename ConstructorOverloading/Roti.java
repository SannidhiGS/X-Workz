public class Roti {
    String name;
    String type;
    String flourType;
    double diameter;
    double weight;
    double price;
    boolean isStuffed;
    String origin;

    Roti() {
    }

    Roti(String name) {
        this.name = name;
    }

    Roti(String type, String flourType) {
        this.type = type;
        this.flourType = flourType;
    }

    Roti(double diameter, double weight) {
        this.diameter = diameter;
        this.weight = weight;
    }

    Roti(double price, boolean isStuffed, String origin) {
        this.price = price;
        this.isStuffed = isStuffed;
        this.origin = origin;
    }

    void getRotiInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Flour Type: " + flourType);
        System.out.println("Diameter: " + diameter + " cm");
        System.out.println("Weight: " + weight + " g");
        System.out.println("Price: ₹" + price);
        System.out.println("Stuffed: " + isStuffed);
        System.out.println("Origin: " + origin);
        System.out.println();
    }
}
