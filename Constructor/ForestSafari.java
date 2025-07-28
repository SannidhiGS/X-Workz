class ForestSafari {
    String locationName; 
    String state;
    double areaSqKm;
    int numberOfJeeps;
    String primaryWildlifeAttraction;
    boolean hasAccommodation;
	
	public void getForestInfo(){
		System.out.println("Location: " + locationName);
        System.out.println("State: " + state);
        System.out.println("Area (sq km): " + areaSqKm);
        System.out.println("Number of Jeeps: " +numberOfJeeps);
        System.out.println("Primary Wildlife: " + primaryWildlifeAttraction);
        System.out.println("Has Accommodation: " + hasAccommodation);
        System.out.println();
	}
}
