class Cracker {
    String name;
    String type;
    String brand;
    double price;
    int quantityPerPack;
    String safetyStandard;
    boolean isSoundCracker;
    String manufacturingLocation;
	
	public void getCrackerInfo(){
		System.out.println("Cracker Name: "+name);
		System.out.println("Type of cracker: "+type);
		System.out.println("The brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Quantity for the packet: "+quantityPerPack);
		System.out.println("Safty Standard: "+safetyStandard);
		System.out.println("Is the soundracker?: "+isSoundCracker);
		System.out.println("Manufacturing location: "+manufacturingLocation);
	}
}
