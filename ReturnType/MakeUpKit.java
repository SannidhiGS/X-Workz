class MakeUpKit {
    static String brandName;
    static int productCount;
    static double kitPrice;
    static String suitableForSkinType;
    static boolean isCrueltyFree;

    public static String brand() {
        brandName = "L'Oréal Paris";
        return brandName;
    }

    public static int count() {
        productCount = 12;
        return productCount;
    }

    public static double price() {
        kitPrice = 2599.99;
        return kitPrice;
    }

    public static String skinType() {
        suitableForSkinType = "All Skin Types";
        return suitableForSkinType;
    }

    public static boolean crueltyFree() {
        isCrueltyFree = false;
        return isCrueltyFree;
    }

    public static void displayMakeUpKitDetails() {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Number of Products: " + productCount);
        System.out.println("Kit Price: " + kitPrice);
        System.out.println("Suitable for: " + suitableForSkinType);
        System.out.println("Cruelty Free: " + isCrueltyFree);
    }
}
