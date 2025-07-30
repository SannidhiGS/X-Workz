public class Jewellery {
    String name;
    String type;
    String brand;
    double price;
    int weight;
    String material;
    boolean isHallmarked;
    String origin;

    Jewellery() {
    }

    Jewellery(String name) {
        this.name = name;
    }

    Jewellery(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    Jewellery(double price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    Jewellery(String material, boolean isHallmarked, String origin) {
        this.material = material;
        this.isHallmarked = isHallmarked;
        this.origin = origin;
    }

    void getJewelleryInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
        System.out.println("Weight: " + weight + "g");
        System.out.println("Material: " + material);
        System.out.println("Hallmarked: " + isHallmarked);
        System.out.println("Origin: " + origin);
        System.out.println();
    }
}
