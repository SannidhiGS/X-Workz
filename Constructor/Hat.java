class Hat {
    int hatId;
    String type; 
    String material; 
    String color;
    String brand;
    double price;
    String size; 
	
	public void getHatInfo(){
		System.out.println("Hat ID: " + hatId);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
        System.out.println("Size: " + size);
        System.out.println();
	}
}