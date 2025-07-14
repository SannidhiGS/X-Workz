class DisneyLand {
    static String parkName;
    static String location;
    static int openingYear;
    static int totalAttractions;
    static boolean hasFireworksShow;
    static boolean hasThemeParades;

    public static String name() {
        parkName = "Disneyland Park";
        return parkName;
    }

    public static String place() {
        location = "Anaheim, California";
        return location;
    }

    public static int yearOpened() {
        openingYear = 1955;
        return openingYear;
    }

    public static int attractions() {
        totalAttractions = 58;
        return totalAttractions;
    }

    public static boolean fireworks() {
        hasFireworksShow = true;
        return hasFireworksShow;
    }

    public static boolean parades() {
        hasThemeParades = true;
        return hasThemeParades;
    }

    public static void displaySpecs() {
        System.out.println("Park Name: " + parkName);
        System.out.println("Location: " + location);
        System.out.println("Opened In: " + openingYear);
        System.out.println("Total Attractions: " + totalAttractions);
        System.out.println("Fireworks Show: " + hasFireworksShow);
        System.out.println("Theme Parades: " + hasThemeParades);
    }
}
