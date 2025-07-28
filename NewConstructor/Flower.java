class Flower {
    String name;
    String color;
    String species;
    String fragrance;
    int lifespanDays;
    double pricePerStem;
    boolean isSeasonal;
    String nativeRegion;
	
	public void  getFlowerInfo(){
		
		System.out.println("Name: " + name);
		 System.out.println("Color: " + color);
		 System.out.println(" Species: " +species);
		 System.out.println(" Fragrance: " +fragrance);
		 System.out.println(" Lifespan: " + lifespanDays );
		 System.out.println(" days, Price/Stem: Rs." + pricePerStem );
		 System.out.println(" Seasonal: " + isSeasonal );
		 System.out.println("Native Region: " + nativeRegion);
        

	
	}
}
