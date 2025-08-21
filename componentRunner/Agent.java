class Agent{
	public static void purchase(String vegetable,int quantity){
		vegetable="Tomato";
		quantity=90;
		
		System.out.println("The vegetable name purchased by agent "+vegetable);
		System.out.println("The quantity of vegetable purchased by agent"+quantity);
		Shop.sell(vegetable,quantity);		
	}
}