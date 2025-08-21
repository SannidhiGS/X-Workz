class Gym {
    static String gymName = "IronFit Gym";
    static String location = "Indiranagar, Bangalore";
    static String ownerName = "Mr. Arjun Mehta";
    static int yearEstablished = 2015;
    static String openingHours = "5:00 AM - 10:00 PM";
    static int noOfTrainers = 10;
    static int noOfMembers = 500;
    static int noOfTreadmills = 8;
    static int noOfExerciseBikes = 6;
    static int noOfDumbbells = 50;
    static boolean hasCardioSection = true;
    static boolean hasWeightTraining = true;
    static boolean hasZumbaClasses = true;
    static boolean hasSteamRoom = false;
    static boolean hasPersonalTraining = true;
    static double monthlyFee = 1500.0;
    static double yearlyFee = 15000.0;
    static boolean hasAC = true;
    static boolean isOpenOnWeekends = true;
    static String contactNumber = "9876543210";

    public static void main(String[] args) {
        System.out.println("Gym Name: " + gymName);
        System.out.println("Location: " + location);
        System.out.println("Owner: " + ownerName);
        System.out.println("Year Established: " + yearEstablished);
        System.out.println("Opening Hours: " + openingHours);
        System.out.println("Number of Trainers: " + noOfTrainers);
        System.out.println("Number of Members: " + noOfMembers);
        System.out.println("Number of Treadmills: " + noOfTreadmills);
        System.out.println("Number of Exercise Bikes: " + noOfExerciseBikes);
        System.out.println("Number of Dumbbells: " + noOfDumbbells);
        System.out.println("Cardio Section Available: " + hasCardioSection);
        System.out.println("Weight Training Available: " + hasWeightTraining);
        System.out.println("Zumba Classes Available: " + hasZumbaClasses);
        System.out.println("Steam Room Available: " + hasSteamRoom);
        System.out.println("Personal Training Available: " + hasPersonalTraining);
        System.out.println("Monthly Fee: ₹" + monthlyFee);
        System.out.println("Yearly Fee: ₹" + yearlyFee);
        System.out.println("Air Conditioned: " + hasAC);
        System.out.println("Open on Weekends: " + isOpenOnWeekends);
        System.out.println("Contact Number: " + contactNumber);
    }
}
