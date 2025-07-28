class Coins{
	int coinFaceValue;
	int coinWeight;
	String material;
	String namePrinted;
	int yearOfPrinted;
	String govtName;
	
	public void getCoinsInfo(){
		System.out.println("Face Value: " + coinFaceValue);
        System.out.println("Weight: " + coinWeight + "g");
        System.out.println("Material: " + material);
        System.out.println("Name Printed: " + namePrinted);
        System.out.println("Year Printed: " + yearOfPrinted);
        System.out.println("Government: " + govtName);
	}
}