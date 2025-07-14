class Tailor {
    static String name;
    static int experienceYears;
    static String specialization;
    static boolean doesCustomDesigns;
    static boolean worksWithMachines;
    static String location;

    public static String tailorName() {
        name = "Raj Tailors";
        return name;
    }

    public static int experience() {
        experienceYears = 15;
        return experienceYears;
    }

    public static String skill() {
        specialization = "Wedding and Formal Wear";
        return specialization;
    }

    public static boolean customDesigns() {
        doesCustomDesigns = true;
        return doesCustomDesigns;
    }

    public static boolean machineWork() {
        worksWithMachines = true;
        return worksWithMachines;
    }

    public static String shopLocation() {
        location = "Mumbai, India";
        return location;
    }

    public static void displaySpecs() {
        System.out.println("Tailor Name: " + name);
        System.out.println("Years of Experience: " + experienceYears);
        System.out.println("Specialization: " + specialization);
        System.out.println("Offers Custom Designs: " + doesCustomDesigns);
        System.out.println("Uses Sewing Machines: " + worksWithMachines);
        System.out.println("Location: " + location);
    }
}
