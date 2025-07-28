class AmusementPark {
    String name;
    String locationCity;
    double areaAcres;
    int numberOfRides;
    double ticketPriceAdult;
    boolean hasWaterParkSection;
	
	public void getAmmusement(){
		System.out.println("Name: " +name);
        System.out.println("Location: " + locationCity);
        System.out.println("Area (Acres): " + areaAcres);
        System.out.println("Number of Rides: " + numberOfRides);
        System.out.println("Adult Ticket Price: Rs." +ticketPriceAdult);
        System.out.println("Has Water Park: " + hasWaterParkSection);
       
	}
}
