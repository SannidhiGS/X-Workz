public class Rod {
    String material;
    double length;
    double diameter;
    String brand;
    double pricePerMeter;
    boolean isRustProof;
    String manufacturingLocation;
    String usage;

    Rod() {
    }

    Rod(String material) {
        this.material = material;
    }

    Rod(double length, double diameter) {
        this.length = length;
        this.diameter = diameter;
    }

    Rod(String brand, double pricePerMeter) {
        this.brand = brand;
        this.pricePerMeter = pricePerMeter;
    }

    Rod(boolean isRustProof, String manufacturingLocation, String usage) {
        this.isRustProof = isRustProof;
        this.manufacturingLocation = manufacturingLocation;
        this.usage = usage;
    }

    void getRodInfo() {
        System.out.println("Material: " + material);
        System.out.println("Length: " + length + " m");
        System.out.println("Diameter: " + diameter + " cm");
        System.out.println("Brand: " + brand);
        System.out.println("Price per Meter: ₹" + pricePerMeter);
        System.out.println("Rust Proof: " + isRustProof);
        System.out.println("Manufacturing Location: " + manufacturingLocation);
        System.out.println("Usage: " + usage);
        System.out.println();
    }
}
