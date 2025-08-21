class Bustand{

	String busStandName;
	int noOfPlatforms;
	String location;
	
	Platform platform;
	
	Bustand(String busStandName,int noOfPlatforms,String location,Platform platform){
	
		this.busStandName=busStandName;
		this.noOfPlatforms=noOfPlatforms;
		this.location=location;
		
		this.platform=platform;

	}
	
	public void getBustandInfo(){
		
		System.out.println("The bus stand name :"+busStandName);
		System.out.println("The no of platform: "+noOfPlatforms);
		System.out.println("The location is :"+location);
		
		this.platform.getPlatformInfo();
	}
}