class Satellite {
    static String satelliteName = "INSAT-3D";
    static String countryOfOrigin = "India";
    static String operator = "ISRO";
    static String missionType = "Weather Monitoring";
    static String orbitType = "Geostationary";
    static double launchMassKg = 2117.0;
    static double dryMassKg = 1400.0;
    static int launchYear = 2013;
    static String launchVehicle = "GSLV Mk II";
    static String manufacturer = "ISRO Satellite Centre";
    static double orbitAltitudeKm = 35786.0;
    static double powerGenerationKw = 2.3;
    static double designLifeYears = 10.0;
    static boolean isOperational = true;
    static int numberOfTransponders = 6;
    static String communicationBands = "C-band, Ku-band";
    static String coverageArea = "India and surrounding regions";
    static String purpose = "Weather Forecasting, Disaster Warning";
    static String controlCenter = "Bangalore Mission Control";
    static String contactEmail = "contact@isro.gov.in";

    public static void main(String[] args) {
        System.out.println("Satellite Name: " + satelliteName);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Operator: " + operator);
        System.out.println("Mission Type: " + missionType);
        System.out.println("Orbit Type: " + orbitType);
        System.out.println("Launch Mass (kg): " + launchMassKg);
        System.out.println("Dry Mass (kg): " + dryMassKg);
        System.out.println("Launch Year: " + launchYear);
        System.out.println("Launch Vehicle: " + launchVehicle);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Orbit Altitude (km): " + orbitAltitudeKm);
        System.out.println("Power Generation (kW): " + powerGenerationKw);
        System.out.println("Design Life (years): " + designLifeYears);
        System.out.println("Is Operational: " + isOperational);
        System.out.println("Number of Transponders: " + numberOfTransponders);
        System.out.println("Communication Bands: " + communicationBands);
        System.out.println("Coverage Area: " + coverageArea);
        System.out.println("Purpose: " + purpose);
        System.out.println("Control Center: " + controlCenter);
        System.out.println("Contact Email: " + contactEmail);
    }
}
