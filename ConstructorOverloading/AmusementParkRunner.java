class AmusementParkRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Amusement Park Data");
	
		/*amuse.locationCity="Bengaluru";
		amuse.areaAcres=25;
		amuse.numberOfRides=40;
		amuse.ticketPriceAdult=800.00;
		amuse.hasWaterParkSection=true;
        System.out.println("Main Ended - Amusement Park Data Display Complete");
		amuse.getParkInfo();*/
		
		AmusementPark amuse1=new AmusementPark("Wondrella");
		amuse1.getParkInfo();
		
		AmusementPark amuse2=new AmusementPark("Bengaluru",25.00);
		amuse2.getParkInfo();
		
	    AmusementPark amuse3=new AmusementPark(40,800.0);
		amuse3.getParkInfo();
		
	    AmusementPark amuse4=new AmusementPark(true);
		amuse4.getParkInfo();
    }
}