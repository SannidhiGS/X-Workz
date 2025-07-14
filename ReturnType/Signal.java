class Signal{
	static int noOfColors;
	static boolean coOrdinated;
	static double cycleR;
	static float intervalT;
	static char isWorking;
	public static int color(){
		noOfColors=3;
		return noOfColors;
	}
	public static boolean coardination(){
		coOrdinated=true;
		return coOrdinated;
	}
	public static double cycle(){
		cycleR=60.00;
		return cycleR;
	}
	public static float interval(){
		intervalT=30.00f;
		return intervalT;
	}
	public static char working(){
		isWorking='Y';
		return isWorking;
	}
	
	public static void signalDet(){
	System.out.println("Number of colors:"+noOfColors);
	System.out.println("Cordinated?: "+coOrdinated);
	System.out.println("Cycle Time :"+cycleR);
	System.out.println("Interval Time: "+intervalT);
	System.out.println("Is signal working properly "+isWorking);
	}
}