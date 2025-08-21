class Marble {
    String color;
    String pattern;
    double diameterCm;
    String material; 
    double weightGrams;
    boolean isRare;
	
	public void getMarbleInfo(){
		System.out.println("Color: " + color);
        System.out.println("Pattern: " + pattern);
        System.out.println("Diameter (cm): " + diameterCm);
        System.out.println("Material: " + material);
        System.out.println("Weight (grams): " + weightGrams);
        System.out.println("Is Rare: " + isRare);
        System.out.println();
	}
}
