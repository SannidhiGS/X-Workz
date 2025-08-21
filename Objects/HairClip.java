class HairClip{
	int productId;
	String brand;
	int noOfHairClip;
	String material;
	double price;
	int rating;
	
	public void getHairInfo(){
		System.out.println("Product ID: " + productId);
        System.out.println("Brand: " + brand);
        System.out.println("No of Clips: " + noOfHairClip);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Rating: " + rating);
	}
}