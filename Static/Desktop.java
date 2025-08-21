class Desktop {
    static String brand = "Dell";
    static String model = "OptiPlex 7090";
    static String processor = "Intel Core i7 11th Gen";
    static String operatingSystem = "Windows 11 Pro";
    static String motherboard = "Dell OEM Intel Chipset";
    static int ramSizeGB = 16;
    static int storageSizeGB = 512;
    static String storageType = "SSD";
    static String graphicsCard = "NVIDIA GeForce GTX 1660";
    static int powerSupplyWatts = 500;
    static boolean hasWiFi = true;
    static boolean hasBluetooth = true;
    static boolean hasOpticalDrive = false;
    static int noOfUSBPorts = 6;
    static boolean hasHDMIPort = true;
    static String cabinetType = "Mini Tower";
    static double weightKg = 6.5;
    static String color = "Black";
    static int yearOfManufacture = 2023;
    static boolean isPreBuilt = true;

    public static void main(String[] args) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Motherboard: " + motherboard);
        System.out.println("RAM Size (GB): " + ramSizeGB);
        System.out.println("Storage Size (GB): " + storageSizeGB);
        System.out.println("Storage Type: " + storageType);
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("Power Supply (Watts): " + powerSupplyWatts);
        System.out.println("Has WiFi: " + hasWiFi);
        System.out.println("Has Bluetooth: " + hasBluetooth);
        System.out.println("Has Optical Drive: " + hasOpticalDrive);
        System.out.println("Number of USB Ports: " + noOfUSBPorts);
        System.out.println("Has HDMI Port: " + hasHDMIPort);
        System.out.println("Cabinet Type: " + cabinetType);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("Color: " + color);
        System.out.println("Year of Manufacture: " + yearOfManufacture);
        System.out.println("Is Pre-Built: " + isPreBuilt);
    }
}
