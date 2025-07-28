class Flower {
    String name;
    String color;
    String species;
    String fragrance;
    int lifespanDays;
    double pricePerStem;
    boolean isSeasonal;
    String nativeRegion;
	
	public void getFlowerInfo(){
		System.out.println("Name: "+name);
		System.out.println("Color: "+color);
		System.out.println("Species: "+species);
		System.out.println("Fragnance: "+fragrance);
		System.out.println("Price per stem :"+pricePerStem);
		System.out.println("is this seasonal?: "+isSeasonal);
		System.out.println("Native Region: "+nativeRegion);
	}
}
