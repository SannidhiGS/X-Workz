class SolarSystem {
    static String name;
    static String centralStar;
    static int numberOfPlanets;
    static int numberOfDwarfPlanets ;
    static int numberOfMoons ; 
    static double ageInBillionYears ;
    static double diameterInMillionKm ; 
    static double distanceFromCenterOfGalaxyLightYears ;
    static double orbitalSpeedKmPerSec ; 
    static boolean hasAsteroidBelt ;
    static int numberOfAsteroidsInBelt ; 
    static boolean hasKuiperBelt ;
    static boolean hasOortCloud;
    static double averageDistanceFromSunAU ; 
    static String galaxyName ;
    static double massOfSunInKg;
    static double totalMassOfPlanetsInKg;
    static String dominantGasInSun;
    static double lightTravelTimeFromSunToEarthMinutes;
    static boolean supportsLife ;

    public static void main(String[] args) {
        System.out.println("Name: " + name);
        System.out.println("Central Star: " + centralStar);
        System.out.println("Number of Planets: " + numberOfPlanets);
        System.out.println("Number of Dwarf Planets: " + numberOfDwarfPlanets);
        System.out.println("Number of Moons: " + numberOfMoons);
        System.out.println("Age (billion years): " + ageInBillionYears);
        System.out.println("Diameter (million km): " + diameterInMillionKm);
        System.out.println("Distance from Galaxy Center (light years): " + distanceFromCenterOfGalaxyLightYears);
        System.out.println("Orbital Speed around Galaxy (km/s): " + orbitalSpeedKmPerSec);
        System.out.println("Has Asteroid Belt: " + hasAsteroidBelt);
        System.out.println("Number of Asteroids in Belt: " + numberOfAsteroidsInBelt);
        System.out.println("Has Kuiper Belt: " + hasKuiperBelt);
        System.out.println("Has Oort Cloud: " + hasOortCloud);
        System.out.println("Average Distance from Sun (AU): " + averageDistanceFromSunAU);
        System.out.println("Galaxy Name: " + galaxyName);
        System.out.println("Mass of Sun (kg): " + massOfSunInKg);
        System.out.println("Total Mass of Planets (kg): " + totalMassOfPlanetsInKg);
        System.out.println("Dominant Gas in Sun: " + dominantGasInSun);
        System.out.println("Light Travel Time from Sun to Earth (minutes): " + lightTravelTimeFromSunToEarthMinutes);
        System.out.println("Supports Life: " + supportsLife);
		
		 name = "Solar System";
 centralStar = "Sun";
     numberOfPlanets = 8;
     numberOfDwarfPlanets = 5;
     numberOfMoons = 214; 
     ageInBillionYears = 4.6;
     diameterInMillionKm = 287.46; 
     distanceFromCenterOfGalaxyLightYears = 27000;
    orbitalSpeedKmPerSec = 828000; 
     hasAsteroidBelt = true;
    numberOfAsteroidsInBelt = 1000000; 
     hasKuiperBelt = true;
     hasOortCloud = true;
     averageDistanceFromSunAU = 1.0; 
     galaxyName = "Milky Way";
    massOfSunInKg = 1.989e30;
     totalMassOfPlanetsInKg = 2.67e27;
    dominantGasInSun = "Hydrogen";
     lightTravelTimeFromSunToEarthMinutes = 8.3;
     supportsLife = true;
	 
	 System.out.println("Name: " + name);
        System.out.println("Central Star: " + centralStar);
        System.out.println("Number of Planets: " + numberOfPlanets);
        System.out.println("Number of Dwarf Planets: " + numberOfDwarfPlanets);
        System.out.println("Number of Moons: " + numberOfMoons);
        System.out.println("Age (billion years): " + ageInBillionYears);
        System.out.println("Diameter (million km): " + diameterInMillionKm);
        System.out.println("Distance from Galaxy Center (light years): " + distanceFromCenterOfGalaxyLightYears);
        System.out.println("Orbital Speed around Galaxy (km/s): " + orbitalSpeedKmPerSec);
        System.out.println("Has Asteroid Belt: " + hasAsteroidBelt);
        System.out.println("Number of Asteroids in Belt: " + numberOfAsteroidsInBelt);
        System.out.println("Has Kuiper Belt: " + hasKuiperBelt);
        System.out.println("Has Oort Cloud: " + hasOortCloud);
        System.out.println("Average Distance from Sun (AU): " + averageDistanceFromSunAU);
        System.out.println("Galaxy Name: " + galaxyName);
        System.out.println("Mass of Sun (kg): " + massOfSunInKg);
        System.out.println("Total Mass of Planets (kg): " + totalMassOfPlanetsInKg);
        System.out.println("Dominant Gas in Sun: " + dominantGasInSun);
        System.out.println("Light Travel Time from Sun to Earth (minutes): " + lightTravelTimeFromSunToEarthMinutes);
        System.out.println("Supports Life: " + supportsLife);
		
    }
}
