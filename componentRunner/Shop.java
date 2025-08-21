class Shop{
	public static void sell(String vegetable,int quantity){
		vegetable="Tomato";
		quantity=70;
		
		System.out.println("The vegetable name is "+vegetable);
		System.out.println("The quantity of vegetable "+quantity);
		Customer.buy(vegetable,quantity);
	}
}