class WashingMachine{
	
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
	public static void increaseRange(){
		if (isOn){
			//isOn=true;
			if(currentRange<maxRange){
				currentRange++;
				System.out.println("The speed of washing machine maximizing"+currentRange);
			}
			else{
				System.out.println("The speed is reached  maximum value");
			}
		}
		else{
		System.out.println("Please on the washing machine");
		}
	}
	public static void decreaseRange(){
		if (isOn){
			//isOn=true;
			if(currentRange>minRange){
				currentRange--;
				System.out.println("The speed of washing machine maximizing"+currentRange);
			}
			else{
				System.out.println("The speed is reached  maximum value");
			}
		}
		else{
		System.out.println("Please on the speed");
		}
	}
}