class Gold{
	static String shopName;
	static int branch;
	static double gPrice;
	static float gPurity;
	static boolean isTrustable;
	public static String shop(){
		shopName="Malbar Gold and Diamond";
		return shopName;
	}
	public static int branches(){
		branch=232;
		return branch;
	}
	public static double price(){
		gPrice=9155.00;
		return gPrice;
	}
	public static float purity(){
		gPurity=22.00f;
		return gPurity;
	}
	public static boolean trust(){
		isTrustable=true;
		return isTrustable;
	}
	
	public static void gold(){
		System.out.println("Shop Name "+shopName);
		System.out.println("Total branches "+branch);
		System.out.println("Current Price "+gPrice);
		System.out.println("Purity "+gPurity);
		System.out.println("Trustable "+isTrustable);
	}
}