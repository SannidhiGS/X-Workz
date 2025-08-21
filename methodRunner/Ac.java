class Ac{
	
	static boolean isOn;
	static int maxRange=8;
	static int minRange=-8;
	static int currentRange=0;
	
	public static void  isOn(){
	if(isOn==false){
		isOn=true;
		System.out.println("The System is connected");
		}
		else{
		System.out.println("The system is not connected:");
		}
	}
	public static void increaseSpeed(){
		if (isOn=true){
			//isOn=true;
			if(currentRange<maxRange){
				currentRange++;
				System.out.println("The range of mixer maximizing"+currentRange);
			}
			else{
				System.out.println("The rage is reached  maximum value");
			}
		}
		else{
		System.out.println("Please on the mixer");
		}
	}
	public static void decreaseSpeed(){
		if (isOn=true){
			//isOn=true;
			if(currentRange>minRange){
				currentRange--;
				System.out.println("The range of mixer maximizing"+currentRange);
			}
			else{
				System.out.println("The rage is reached  maximum value");
			}
		}
		else{
		System.out.println("Please on the mixer");
		}
	}
}