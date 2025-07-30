public class KarateSuit {
    String name;
    String size;
    String brand;
    double price;
    int quantity;
    String material;
    boolean isCustomFit;
    String manufacturingLocation;

    KarateSuit() {
    }

    KarateSuit(String name) {
        this.name = name;
    }

    KarateSuit(String size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    KarateSuit(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    KarateSuit(String material, boolean isCustomFit, String manufacturingLocation) {
        this.material = material;
        this.isCustomFit = isCustomFit;
        this.manufacturingLocation = manufacturingLocation;
    }

    void getSuitInfo() {
        System.out.println("Name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Material: " + material);
        System.out.println("Custom Fit: " + isCustomFit);
        System.out.println("Manufacturing Location: " + manufacturingLocation);
        System.out.println();
    }
}
