class Platform{

	int noOfPlatforms;
	String boardName;
	
	Bus bus;
	
	Platform(int noOfPlatforms,String boardName,Bus bus){
		this.noOfPlatforms=noOfPlatforms;
		this.boardName=boardName;
		this.bus=bus;
	
	}
	public void getPlatformInfo(){
		System.out.println("The number of platforms: "+noOfPlatforms);
		System.out.println("The boardName: "+boardName);
		this.bus.getBusDetails();
	
	}


}