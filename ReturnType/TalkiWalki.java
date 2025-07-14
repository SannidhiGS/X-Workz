class TalkiWalki{
static String brandN;
static int Range;
static float totalCost;
static boolean isLisenceFree;
static double batteryLife;
	public static String brand(){
		brandN="MotorOla";
		return brandN;
	}
	public static int range(){
		Range=5;
		return Range;
	}
	public static float cost(){
		totalCost=6500.00f;
		return totalCost;
		
	}
	public static boolean license(){
		isLisenceFree=true;
		return isLisenceFree;
	}
	public static double battery(){
		batteryLife=12.0;
		return batteryLife;
	}
	
	public static void tw(){
		System.out.println("Brand: "+brandN);
		System.out.println("Range in KM: "+Range);
		System.out.println("Total Cost:" +totalCost);
		System.out.println("Is license free "+isLisenceFree);
		System.out.println("The battery life "+batteryLife);
	}
}