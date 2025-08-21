class Broker{
	public static void brokerage(String vegetable,int quantity){
		 vegetable="Tomato";
		 quantity=90;
		
		System.out.println("The vegetable purchases by the broker "+vegetable);
		System.out.println("The vegetable purchased by the broker "+quantity);
		
		Agent.purchase(vegetable,quantity);
	}
}	