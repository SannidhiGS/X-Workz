class Stadium {
    static String stadiumName = "jaharlal nehru stadium";
    static String location = "Shimoga, karnataka";
    static String owner = "Sports Authority of karnataka";
    static String primarySport = "Cricket";
    static String architect = "National Architects Ltd.";
    static int seatingCapacity = 7500;
    static int numberOfEntrances = 12;
    static int numberOfVIPBoxes = 20;
    static int numberOfFoodStalls = 30;
    static int numberOfParkingSlots = 1000;
    static boolean hasRoof = false;
    static boolean hasFloodLights = true;
    static boolean hasLEDScoreboard = true;
    static boolean hasPracticeGround = true;
    static boolean isAccessible = true;
    static int yearOpened = 2005;
    static double areaInAcres = 50.0;
    static boolean hostsConcerts = true;
    static boolean hasMediaRoom = true;
    static String contactEmail = "info@nationalsportsarena.in";

    public static void main(String[] args) {
        System.out.println("Stadium Name: " + stadiumName);
        System.out.println("Location: " + location);
        System.out.println("Owner: " + owner);
        System.out.println("Primary Sport: " + primarySport);
        System.out.println("Architect: " + architect);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Number of Entrances: " + numberOfEntrances);
        System.out.println("Number of VIP Boxes: " + numberOfVIPBoxes);
        System.out.println("Number of Food Stalls: " + numberOfFoodStalls);
        System.out.println("Number of Parking Slots: " + numberOfParkingSlots);
        System.out.println("Has Roof: " + hasRoof);
        System.out.println("Has Flood Lights: " + hasFloodLights);
        System.out.println("Has LED Scoreboard: " + hasLEDScoreboard);
        System.out.println("Has Practice Ground: " + hasPracticeGround);
        System.out.println("Is Accessible: " + isAccessible);
        System.out.println("Year Opened: " + yearOpened);
        System.out.println("Area (in acres): " + areaInAcres);
        System.out.println("Hosts Concerts: " + hostsConcerts);
        System.out.println("Has Media Room: " + hasMediaRoom);
        System.out.println("Contact Email: " + contactEmail);
    }
}
