class Blade{
	int productId;
	String brand;
	int noOfBlades;
	String skinType;
	double price;
	int rating;
	
	public void getBladeInfo(){
		System.out.println("Product Id: "+productId);
		System.out.println("Brand: "+brand);
		System.out.println("No of Blades :"+noOfBlades);
		System.out.println("Skin Type: "+skinType);
		System.out.println("Price: "+price);
		System.out.println("Rating: "+rating);
	}
}