class Tyre {
    static String brandName;
    static String type;
    static int sizeInInches;
    static boolean isTubeless;
    static boolean isAllSeason;
    static String treadPattern;

    public static String brand() {
        brandName = "Michelin";
        return brandName;
    }

    public static String tyreType() {
        type = "Radial";
        return type;
    }

    public static int size() {
        sizeInInches = 17;
        return sizeInInches;
    }

    public static boolean tubeless() {
        isTubeless = true;
        return isTubeless;
    }

    public static boolean allSeason() {
        isAllSeason = true;
        return isAllSeason;
    }

    public static String tread() {
        treadPattern = "Symmetric";
        return treadPattern;
    }

    public static void displaySpecs() {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Type: " + type);
        System.out.println("Size: " + sizeInInches + " inches");
        System.out.println("Tubeless: " + isTubeless);
        System.out.println("All-Season: " + isAllSeason);
        System.out.println("Tread Pattern: " + treadPattern);
    }
}

