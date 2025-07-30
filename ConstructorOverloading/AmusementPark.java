class AmusementPark {
    String name;
    String locationCity;
    double areaAcres;
    int numberOfRides;
    double ticketPriceAdult;
    boolean hasWaterParkSection;
	
	AmusementPark(){
			
			System.out.println("The constructor is invoked");
			
		}
	
	AmusementPark(String name){
		this.name=name;
	}
	
	AmusementPark(String locationCity,double areaAcres){
		this.locationCity=locationCity;
		this.areaAcres=areaAcres;
	}
	
	AmusementPark(int numberOfRides,double ticketPriceAdult){
		this.numberOfRides=numberOfRides;
		this.ticketPriceAdult=ticketPriceAdult;
	}
	AmusementPark(boolean hasWaterParkSection)
	{
		this.hasWaterParkSection=hasWaterParkSection;
	}
	
	public void getParkInfo() {
		
		System.out.println("Name: " + name);
        System.out.println("Location: " + locationCity);
        System.out.println("Area (Acres): " +areaAcres);
        System.out.println("Number of Rides: " + numberOfRides);
        System.out.println("Adult Ticket Price: Rs." + ticketPriceAdult);
        System.out.println("Has Water Park: " +hasWaterParkSection);
        System.out.println();
	}

}
