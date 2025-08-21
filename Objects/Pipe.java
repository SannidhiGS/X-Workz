class Pipe {
    int pipeId;
    String material; 
    double diameterCm; 
    double lengthCm;
    String usage; 
    double pressureRatingPsi; 
    double pricePerMeter;
	
	public void getPipInfo(){
		System.out.println("Pipe ID: " + pipeId);
        System.out.println("Material: " + material);
        System.out.println("Diameter: " + diameterCm + " cm");
        System.out.println("Length: " + lengthCm + " cm");
        System.out.println("Usage: " + usage);
        System.out.println("Pressure Rating: " + pressureRatingPsi + " PSI");
        System.out.println("Price per Meter: $" + pricePerMeter);
        System.out.println();
	}
}