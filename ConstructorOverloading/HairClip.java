public class HairClip {
    String name;
    String type;
    String brand;
    double price;
    int quantityInPack;
    String material;
    boolean isDecorative;
    String manufacturingLocation;

    HairClip() {
    }

    HairClip(String name) {
        this.name = name;
    }

    HairClip(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    HairClip(double price, int quantityInPack) {
        this.price = price;
        this.quantityInPack = quantityInPack;
    }

    HairClip(String material, boolean isDecorative, String manufacturingLocation) {
        this.material = material;
        this.isDecorative = isDecorative;
        this.manufacturingLocation = manufacturingLocation;
    }

    void getClipInfo() {
        System.out.println("Name: " + name + ", Type: " + type + ", Brand: " + brand + ", Price: ₹" + price + ", Qty/Pack: " + quantityInPack +
                ", Material: " + material + ", Decorative: " + isDecorative + ", Location: " + manufacturingLocation);
    }
}
