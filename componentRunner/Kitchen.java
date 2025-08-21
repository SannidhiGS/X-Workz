class Kitchen{
	static String kitchenArea="30*40";
	static int noOfUt=200;
	static String typeOfut="Steel and glass";
	
	public static void kitchenInfo(){
	System.out.println("The are of kitchen "+kitchenArea);
	System.out.println("The no of utencils "+noOfUt);
	System.out.println("Type of utencils "+typeOfut);
	
	Chef.chefInfo();
	}
}