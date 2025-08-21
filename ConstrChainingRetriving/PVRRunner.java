class PVRRunner{

	public static void main(String args[]){
	
		Movie movie=new Movie("KA090","Ekka");
		Screen screen=new Screen("Th01",true, movie);
		PVR pvr=new PVR(18,"Diman","Banglore",screen);
		
		pvr.getPvrInfo();
	
	}
}