public class GymEquipment {
    String name;
    String category;
    String brand;
    double price;
    int weightCapacity;
    String material;
    boolean isAdjustable;
    String manufacturingLocation;

    GymEquipment() {
    }

    GymEquipment(String name) {
        this.name = name;
    }

    GymEquipment(String category, String brand) {
        this.category = category;
        this.brand = brand;
    }

    GymEquipment(double price, int weightCapacity) {
        this.price = price;
        this.weightCapacity = weightCapacity;
    }

    GymEquipment(String material, boolean isAdjustable, String manufacturingLocation) {
        this.material = material;
        this.isAdjustable = isAdjustable;
        this.manufacturingLocation = manufacturingLocation;
    }

    void getEquipmentInfo() {
        System.out.println("Name: " + name + ", Category: " + category + ", Brand: " + brand + ", Price: ₹" + price + ", Weight Capacity: " + weightCapacity +
                "kg, Material: " + material + ", Adjustable: " + isAdjustable + ", Location: " + manufacturingLocation);
    }
}
