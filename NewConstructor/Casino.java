class Casino {
    String name;
    String location;
    boolean isOpen24Hours;
    int numberOfGames;
    boolean hasHotel;
    double entryFee;
	
	public void getCasinoInfo(){
		System.out.println("name: " + name);
		System.out.println("location: " + location);
		System.out.println("isOpen24Hours: " + isOpen24Hours);
		System.out.println("numberOfGames: " + numberOfGames);
		System.out.println("hasHotel: " + hasHotel);
		System.out.println("entryFee: " + entryFee);
	}
}
