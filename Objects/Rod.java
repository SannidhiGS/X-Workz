class Rod {
    int id;
    String material;
    double lengthCm;
    double diameterCm;
    String color;
    double weightKg;
    double price;
	
	public void getRodInfo(){
		
		System.out.println("ID: " + id);
        System.out.println("Material: " + material);
        System.out.println("Length: " + lengthCm + " cm");
        System.out.println("Diameter: " + diameterCm + " cm");
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weightKg + " kg");
        System.out.println("Price: $" + price);
        System.out.println(); 
	}
}