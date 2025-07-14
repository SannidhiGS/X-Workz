class Radio{
	static String brandName;
	static int totalCost;
	static boolean isGood;
	static double ratingP;
	static char productGrade;
	
	public static String brand(){
		 brandName="Philps";
		return brandName;
	}
	public static int cost(){
		totalCost=1499;
		return totalCost;
	}
	public static boolean quality(){
		isGood=true;
		return isGood;
	}
	public static double rating(){
		 ratingP=3.6;
		return ratingP;
	}
	public static char grade(){
		productGrade='A';
		return productGrade;
		
	}
	
	public static void productDet(){
		System.out.println("The radio brand:"+brandName);
		System.out.println("Total cost of the product: "+totalCost);
		System.out.println("The quality of the product "+isGood);
		System.out.println("The rating of the product "+ratingP);
		System.out.println("The grade of the product "+productGrade);
	}
}