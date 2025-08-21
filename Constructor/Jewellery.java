class Jewellery {
    int productId;
    String type;        
    String material;    
    String brand;
    double weightGrams; 
    double price;
    int rating; 
	
	public void getJewel(){
		System.out.println("\n--- Jewellery Item 20 ---");
        System.out.println("Product ID: " + productId);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Brand: " + brand);
        System.out.println("Weight: " + weightGrams + " grams");
        System.out.println("Price: " + price);
        System.out.println("Rating: " + rating + " stars");
	} 	
}