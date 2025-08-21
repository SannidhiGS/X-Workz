class Court {
    static String courtName = "High Court of Karnataka";
    static String location = "Bangalore, Karnataka";
    static String courtType = "High Court";
    static String jurisdiction = "State of Karnataka";
    static String chiefJustice = "Prasanna B. Varale";
    static int noOfJudges = 35;
    static int noOfCourtRooms = 20;
    static int noOfClerks = 50;
    static int noOfPendingCases = 55000;
    static int yearEstablished = 1884;
    static boolean hasLibrary = true;
    static boolean hasDigitalFiling = true;
    static boolean hasCCTV = true;
    static boolean hasPublicGallery = true;
    static boolean hasLegalAidCell = true;
    static String workingHours = "10:30 AM - 4:30 PM";
    static boolean isOpenOnSaturday = false;
    static boolean hasParkingFacility = true;
    static String officialWebsite = "https://karnatakajudiciary.kar.nic.in/";
    static String contactEmail = "registrar@kar.nic.in";

    public static void main(String[] args) {
        System.out.println("Court Name: " + courtName);
        System.out.println("Location: " + location);
        System.out.println("Court Type: " + courtType);
        System.out.println("Jurisdiction: " + jurisdiction);
        System.out.println("Chief Justice: " + chiefJustice);
        System.out.println("Number of Judges: " + noOfJudges);
        System.out.println("Number of Courtrooms: " + noOfCourtRooms);
        System.out.println("Number of Clerks: " + noOfClerks);
        System.out.println("Number of Pending Cases: " + noOfPendingCases);
        System.out.println("Year Established: " + yearEstablished);
        System.out.println("Has Library: " + hasLibrary);
        System.out.println("Has Digital Filing: " + hasDigitalFiling);
        System.out.println("Has CCTV: " + hasCCTV);
        System.out.println("Has Public Gallery: " + hasPublicGallery);
        System.out.println("Has Legal Aid Cell: " + hasLegalAidCell);
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Open on Saturday: " + isOpenOnSaturday);
        System.out.println("Has Parking Facility: " + hasParkingFacility);
        System.out.println("Official Website: " + officialWebsite);
        System.out.println("Contact Email: " + contactEmail);
    }
}
