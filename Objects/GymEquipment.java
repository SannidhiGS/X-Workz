class GymEquipment {
    int productId;
    String typeOfEquip;
    String brand;
    double weight;
    int noOfEquip;
    double price;
    int rating;
	
	public void getGymInfo(){
		System.out.println("Product ID: " + productId);
        System.out.println("Type: " + typeOfEquip);
        System.out.println("Brand: " + brand);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Number of Equipment: " + noOfEquip);
        System.out.println("Price: $" + price);
        System.out.println("Rating: " + rating + " stars");
	}
}