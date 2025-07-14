class Banner{
	static String matUsed;
	static boolean isDurable;
	static int price;
	static double breadth;
	static double width;
	static char isAvailble;
	
	public static String mat(){
		matUsed="PVC co component";
		return matUsed;
	}
	public static boolean durable(){
		isDurable=true;
		return isDurable;
	}
	public static int cost(){
		price=230;
		return price;
	}
	public static double port(){
		width=25.00;
		breadth=30.00;
		//return width;
		return breadth;
	}
	public static char avail(){
		isAvailble='Y';
		return isAvailble;
	}
	
	public static void bannerDet(){
		System.out.println("The materils used: "+matUsed);
		System.out.println("Is Durable:"+isDurable);
		System.out.println("The cost is "+price);
		System.out.println("The width "+width+" The breadth "+breadth);
		System.out.println("The product is now available: "+isAvailble);
	}
	
}