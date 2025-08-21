class BustandRunner{
	
	public static void main(String args[]){
	
		Bus bus=new Bus("215H","J.P nagar");
		
		Platform platform=new Platform(20,"Jayanagar",bus);
	
		Bustand bustand=new Bustand("Majestic",20,"Banglore",platform);
		
		
		
		platform.bus=bus;
		bustand.getBustandInfo();
	
	}

}