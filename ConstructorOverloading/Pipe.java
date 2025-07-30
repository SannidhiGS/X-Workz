public class Pipe {
    String material;
    double diameter;
    double length;
    String brand;
    double pricePerMeter;
    boolean isCorrosionResistant;
    String manufacturingLocation;
    String usageType;

    Pipe() {
    }

    Pipe(String material) {
        this.material = material;
    }

    Pipe(double diameter, double length) {
        this.diameter = diameter;
        this.length = length;
    }

    Pipe(String brand, double pricePerMeter) {
        this.brand = brand;
        this.pricePerMeter = pricePerMeter;
    }

    Pipe(boolean isCorrosionResistant, String manufacturingLocation, String usageType) {
        this.isCorrosionResistant = isCorrosionResistant;
        this.manufacturingLocation = manufacturingLocation;
        this.usageType = usageType;
    }

    void getPipeInfo() {
        System.out.println("Material: " + material);
        System.out.println("Diameter: " + diameter + " cm");
        System.out.println("Length: " + length + " m");
        System.out.println("Brand: " + brand);
        System.out.println("Price per Meter: ₹" + pricePerMeter);
        System.out.println("Corrosion Resistant: " + isCorrosionResistant);
        System.out.println("Manufacturing Location: " + manufacturingLocation);
        System.out.println("Usage Type: " + usageType);
        System.out.println();
    }
}
