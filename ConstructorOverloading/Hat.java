public class Hat {
    String name;
    String type;
    String brand;
    double price;
    int size;
    String material;
    boolean isUnisex;
    String manufacturingLocation;

    Hat() {
    }

    Hat(String name) {
        this.name = name;
    }

    Hat(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    Hat(double price, int size) {
        this.price = price;
        this.size = size;
    }

    Hat(String material, boolean isUnisex, String manufacturingLocation) {
        this.material = material;
        this.isUnisex = isUnisex;
        this.manufacturingLocation = manufacturingLocation;
    }

    void getHatInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.println("Unisex: " + isUnisex);
        System.out.println("Location: " + manufacturingLocation);
        System.out.println();
    }
}

