class Hotel{
	static String hotelName="Sannidhi Paradise";
	static String hotelType="Vegeterian";
	static String location="Jayanagara 4th block";
	static boolean isOnlineDelivery;
	public static void hotelInfo(){
		System.out.println("The hotel name "+hotelName);
		System.out.println("The hotel type "+hotelType);
		System.out.println("Location: "+location);
		System.out.println("is online delivary :"+isOnlineDelivery);
		Kitchen.kitchenInfo();
	}
}