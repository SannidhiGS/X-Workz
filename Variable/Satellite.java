class Satellite {
    static String satelliteName;
    static String countryOfOrigin;
    static String operator ;
    static String missionType ;
    static String orbitType ;
    static double launchMassKg ;
    static double dryMassKg ;
    static int launchYear ;
    static String launchVehicle;
    static String manufacturer ;
    static double orbitAltitudeKm ;
    static double powerGenerationKw ;
    static double designLifeYears ;
    static boolean isOperational;
    static int numberOfTransponders;
    static String communicationBands ;
    static String coverageArea ;
    static String purpose ;
    static String controlCenter ;
    static String contactEmail ;

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
		
	 satelliteName = "INSAT-3D";
    countryOfOrigin = "India";
    operator = "ISRO";
     missionType = "Weather Monitoring";
     orbitType = "Geostationary";
     launchMassKg = 2117.0;
     dryMassKg = 1400.0;
     launchYear = 2013;
    String launchVehicle = "GSLV Mk II";
     manufacturer = "ISRO Satellite Centre";
    orbitAltitudeKm = 35786.0;
     powerGenerationKw = 2.3;
     designLifeYears = 10.0;
    isOperational = true;
     numberOfTransponders = 6;
     communicationBands = "C-band, Ku-band";
     coverageArea = "India and surrounding regions";
     purpose = "Weather Forecasting, Disaster Warning";
     controlCenter = "Bangalore Mission Control";
     String contactEmail = "contact@isro.gov.in";
	
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
