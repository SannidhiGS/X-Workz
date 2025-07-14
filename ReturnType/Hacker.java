class Hacker {
    static String alias;
    static String skillLevel;
    static String specialization;
    static int knownLanguages;
    static boolean isEthical;
    static boolean worksInTeam;

    public static String name() {
        alias = "CyberGhost";
        return alias;
    }

    public static String level() {
        skillLevel = "Advanced";
        return skillLevel;
    }

    public static String field() {
        specialization = "Penetration Testing";
        return specialization;
    }

    public static int languages() {
        knownLanguages = 5; 
        return knownLanguages;
    }

    public static boolean ethical() {
        isEthical = true; 
        return isEthical;
    }

    public static boolean teamwork() {
        worksInTeam = false; 
        return worksInTeam;
    }

    public static void displaySpecs() {
        System.out.println("Hacker Alias: " + alias);
        System.out.println("Skill Level: " + skillLevel);
        System.out.println("Specialization: " + specialization);
        System.out.println("Known Programming Languages: " + knownLanguages);
        System.out.println("Ethical Hacker: " + isEthical);
        System.out.println("Works in Team: " + worksInTeam);
    }
}
