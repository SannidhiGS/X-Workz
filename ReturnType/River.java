class River{
	static String riverName;
	static int km;
	static boolean haveCulure;
	static double rPurity;
	static char isSacred;
	public static String name(){
		riverName="Tunga";
		return riverName;
	}
	public static int len(){
		 km=147;
		return km;
	}
	public static boolean culture(){
		 haveCulure=true;
		 return haveCulure;
	}
	public static double purity(){
		rPurity=9.00;
		return rPurity;
	}
	public static char sacred(){
		char isSacred='Y';
		return isSacred;
	}
	
	public static void river(){
		System.out.println("Name: "+riverName);
		System.out.println("Kilometer: "+km);
		System.out.println("Have mythology "+haveCulure);
		System.out.println("Purity level"+rPurity);
		System.out.println("Sacred "+isSacred);
	}
}