class Market{
	static String marketName;
	static int noOfShops;
	static double marketRating;
	static float estimatedCost;
	static boolean isShopingGood;
	public static String name(){
		marketName="Chikpet Market-old commercial place";
		return marketName;
	}
	public static int shop(){
		noOfShops=500;
		return noOfShops;
	}
	public static double rating(){
		marketRating=4.5;
		return marketRating;
	}
	public static float cost(){
		estimatedCost=15000.00f;
		return estimatedCost;
	}
	public static boolean GoodShoping(){
		isShopingGood=true;
		return isShopingGood;
	}
	
	public static void market(){
		System.out.println("The market name: "+marketName);
		System.out.println("Number of shops: "+noOfShops);
		System.out.println("Rating: "+marketRating);
		System.out.println("Estimated Cost:"+estimatedCost);
		System.out.println("Is it shopping experience good: "+isShopingGood);
	}
}