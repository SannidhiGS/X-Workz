class Cloth{
	static String brandName;
	static int noOfCloth;
	static double productRating;
	static float totalCost;
	static boolean isProductWorth;
	public static String brand(){
		brandName="SoftPun";
		return brandName;
	}
	public static int number(){
		noOfCloth=3;
		return noOfCloth;
	}
	public static double rating(){
		productRating=4.5;
		return productRating;
	}
	public static float cost(){
		totalCost=400.00f;
		return totalCost;
	}
	public static boolean worth(){
		isProductWorth=true;
		return isProductWorth;
	}
	
	public static void productDet(){
		System.out.println("Brand: "+brandName);
		System.out.println("noOfCloth: "+noOfCloth);
		System.out.println("Product Rating: "+productRating);
		System.out.println("Cost: "+totalCost);
		System.out.println("Is the product wort? "+isProductWorth);
	}
}