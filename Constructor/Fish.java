class Fish {
    String species;
    String color;
    String habitat; 
    double averageLengthCm;
    double averageWeightKg;
    boolean isEdible;
	
	public void getFishInfo(){
		System.out.println("Species: " + species);
        System.out.println("Color: " +color);
        System.out.println("Habitat: " + habitat);
        System.out.println("Average Length (cm): " + averageLengthCm);
        System.out.println("Average Weight (kg): " + averageWeightKg);
        System.out.println("Is Edible: " + isEdible);
        System.out.println();
	}
}
