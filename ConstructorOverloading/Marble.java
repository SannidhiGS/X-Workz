public class Marble {
    String name;
    String color;
    String origin;
    double pricePerSquareFoot;
    double thickness;
    boolean isPolished;
    String pattern;
    String supplier;

    Marble() {
    }

    Marble(String name) {
        this.name = name;
    }

    Marble(String color, String origin) {
        this.color = color;
        this.origin = origin;
    }

    Marble(double pricePerSquareFoot, double thickness) {
        this.pricePerSquareFoot = pricePerSquareFoot;
        this.thickness = thickness;
    }

    Marble(boolean isPolished, String pattern, String supplier) {
        this.isPolished = isPolished;
        this.pattern = pattern;
        this.supplier = supplier;
    }

    void getMarbleInfo() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Origin: " + origin);
        System.out.println("Price/Sq Ft: ₹" + pricePerSquareFoot);
        System.out.println("Thickness: " + thickness + " cm");
        System.out.println("Polished: " + isPolished);
        System.out.println("Pattern: " + pattern);
        System.out.println("Supplier: " + supplier);
        System.out.println();
    }
}
