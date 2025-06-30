class Projector {
    static String brand = "Epson";
    static String model = "EB-X41";
    static String resolution = "1024x768"; 
    static String projectionTechnology = "3LCD";
    static String color = "White";
    static int brightnessInLumens = 3600;
    static int contrastRatio = 15000;
    static double lampLifeInHours = 6000.0;
    static double screenSizeInInches = 300.0;
    static double throwRatio = 1.48;
    static boolean isWirelessEnabled = true;
    static boolean hasHDMIPort = true;
    static boolean hasVGAInput = true;
    static boolean supports3D = false;
    static boolean hasBuiltInSpeaker = true;
    static double weightInKg = 2.5;
    static String aspectRatio = "4:3";
    static String keystoneCorrection = "Vertical ±30°";
    static int powerConsumptionWatts = 282;
    static boolean isPortable = true;

    public static void main(String[] args) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Resolution: " + resolution);
        System.out.println("Projection Technology: " + projectionTechnology);
        System.out.println("Color: " + color);
        System.out.println("Brightness (Lumens): " + brightnessInLumens);
        System.out.println("Contrast Ratio: " + contrastRatio + ":1");
        System.out.println("Lamp Life (Hours): " + lampLifeInHours);
        System.out.println("Max Screen Size (inches): " + screenSizeInInches);
        System.out.println("Throw Ratio: " + throwRatio);
        System.out.println("Wireless Enabled: " + isWirelessEnabled);
        System.out.println("HDMI Port Available: " + hasHDMIPort);
        System.out.println("VGA Input Available: " + hasVGAInput);
        System.out.println("3D Support: " + supports3D);
        System.out.println("Built-in Speaker: " + hasBuiltInSpeaker);
        System.out.println("Weight (kg): " + weightInKg);
        System.out.println("Aspect Ratio: " + aspectRatio);
        System.out.println("Keystone Correction: " + keystoneCorrection);
        System.out.println("Power Consumption (Watts): " + powerConsumptionWatts);
        System.out.println("Portable: " + isPortable);
    }
}
