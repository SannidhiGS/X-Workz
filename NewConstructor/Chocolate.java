class Chocolate{
	
	int chocolateId;
	String brand;
	double price;
	String ingredients[];
	String name;
	
	public void getChocolateDetails(){
		System.out.println("The Chocolate ID: "+chocolateId);
		System.out.println("The brand name :"+brand);
		System.out.println("The brand price :"+price);
		for(String ingredient:ingredients)
		System.out.println("The ingredients are "+ingredient);
		System.out.println("The chocolate name: "+name);		
	}
	
}