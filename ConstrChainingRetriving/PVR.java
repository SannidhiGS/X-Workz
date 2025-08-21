class PVR{
	
	int pvrID;
	String pvrName;
	String pvrLocation;
	
	Screen screen;
	
	PVR(int pvrID,String pvrName,String pvrLocation,Screen screen){
		this.pvrID=pvrID;
		this.pvrName=pvrName;
		this.pvrLocation=pvrLocation;
		
		this.screen=screen;
	}
	
	public void getPvrInfo(){
		System.out.println("The PVR Id "+pvrID);
		System.out.println("The PVR Name "+pvrName);
		System.out.println("The PVR location "+pvrLocation);
		
		this.screen.getScreenDetails();
	
	}

}