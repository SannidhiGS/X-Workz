class Property {
	static String name="Ravi Kumar";
	static String email="ravi.kumar@email.com";
	static long phone=9988776655L;
    public static void buy(String propType,String location,double price) {
        System.out.println("Property Type: " + propType);
        System.out.println("Location: " + location);
        System.out.println("Price: " + price);
        Buyer.details(name,email,phone);
    }
}
