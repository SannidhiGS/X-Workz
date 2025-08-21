class Speaker{
	static int maxVolume=7;
	static int minVolume=-7;
	static boolean isConnected;
	static int currentVolume=0;
	public static void onOrOff(){
		if(isConnected=true){
			//isConnected=true;
			System.out.println("The speacker is on");
		}
		else{
			isConnected=false;
			System.out.println("The speacker is not on");
		}
	}
	 public static void increaseVolume(){
		if(isConnected==true){
			if(currentVolume<maxVolume){
				currentVolume=currentVolume+1;
				System.out.println("the volume is increasing"+currentVolume);
				}
			else{
				System.out.println("the volume reached the max"+currentVolume);
				}
		}
		else{
		 System.out.println("Goobe Speaker on madu....");
		}
	}
	
	public static void decreaseVolume(){
		if(isConnected==true){
			if(currentVolume>minVolume){
				currentVolume--;
				System.out.println("The volume is decresing"+currentVolume);
			}
			else{
				System.out.println("The volume is reached its minimum value");
			}
		}
		else{
			System.out.println("The speacker is not on Please on the speacker");
		}
	}
}
				