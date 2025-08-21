class Casino {
    String name;
    String locationCity;
    int numberOfGames;
    boolean hasHotel;
    double averageDailyRevenueMillions;
    int yearEstablished;
	
	public void getCasinoInfo(){
		System.out.println("Name of the Casino: "+name);
		System.out.println("Location of the Casino: "+locationCity);
		System.out.println("The number of games: "+numberOfGames);
		System.out.println("The average daily revenue: "+averageDailyRevenueMillions);
		System.out.println("The year of established: "+yearEstablished);
	}
}
