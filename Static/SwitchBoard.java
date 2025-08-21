class SwitchBoard {
    static String brandName = "GM";
    static String modelNumber = "LSB2025";
    static String material = "Polycarbonate";
    static String color = "puple";
    static String boardType = "Modular";
    static int noOfSwitches = 6;
    static int noOfSockets = 2;
    static int noOfIndicators = 1;
    static int noOfFuses = 1;
    static int voltageRating = 240; 
    static double frequency = 50.0; 
    static boolean hasSurgeProtection = true;
    static boolean isSmartEnabled = false;
    static boolean isChildProof = true;
    static boolean hasUSBPorts = true;
    static int noOfUSBPorts = 2;
    static double maxCurrentCapacity = 16.0; 
    static boolean hasMCB = true;
    static String mountingType = "Wall Mounted";
    static boolean isWaterResistant = false;
    public static void main(String[] args) {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Board Type: " + boardType);
        System.out.println("Number of Switches: " + noOfSwitches);
        System.out.println("Number of Sockets: " + noOfSockets);
        System.out.println("Number of Indicators: " + noOfIndicators);
        System.out.println("Number of Fuses: " + noOfFuses);
        System.out.println("Voltage Rating: " + voltageRating + "V");
        System.out.println("Frequency: " + frequency + "Hz");
        System.out.println("Has Surge Protection: " + hasSurgeProtection);
        System.out.println("Smart Enabled: " + isSmartEnabled);
        System.out.println("Child Proof: " + isChildProof);
        System.out.println("Has USB Ports: " + hasUSBPorts);
        System.out.println("Number of USB Ports: " + noOfUSBPorts);
        System.out.println("Max Current Capacity: " + maxCurrentCapacity + "A");
        System.out.println("Has MCB: " + hasMCB);
        System.out.println("Mounting Type: " + mountingType);
        System.out.println("Water Resistant: " + isWaterResistant);
    }
}
