class GamingPc {
    static String brandName;
    static String processor;
    static String graphicsCard;
    static int ramSize;
    static int ssdSize;
    static boolean hasRGB;

    public static String brand() {
        brandName = "Alienware";
        return brandName;
    }

    public static String cpu() {
        processor = "Intel Core i9-14900K";
        return processor;
    }

    public static String gpu() {
        graphicsCard = "NVIDIA GeForce RTX 4090";
        return graphicsCard;
    }

    public static int ram() {
        ramSize = 64; // in GB
        return ramSize;
    }

    public static int ssd() {
        ssdSize = 2000; // in GB
        return ssdSize;
    }

    public static boolean rgbSupport() {
        hasRGB = true;
        return hasRGB;
    }

    public static void displaySpecs() {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Processor: " + processor);
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("RAM Size: " + ramSize + " GB");
        System.out.println("SSD Size: " + ssdSize + " GB");
        System.out.println("RGB Lighting: " + hasRGB);
    }
}
