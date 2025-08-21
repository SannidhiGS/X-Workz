public class Weapon {
    String name;
    String type;
    String manufacturer;
    double weight;
    double length;
    double price;
    boolean isAutomatic;
    String origin;

    Weapon() {
    }

    Weapon(String name) {
        this.name = name;
    }

    Weapon(String type, String manufacturer) {
        this.type = type;
        this.manufacturer = manufacturer;
    }

    Weapon(double weight, double length) {
        this.weight = weight;
        this.length = length;
    }

    Weapon(double price, boolean isAutomatic, String origin) {
        this.price = price;
        this.isAutomatic = isAutomatic;
        this.origin = origin;
    }

    void getWeaponInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Length: " + length + " cm");
        System.out.println("Price: ₹" + price);
        System.out.println("Automatic: " + isAutomatic);
        System.out.println("Origin: " + origin);
        System.out.println();
    }
}
