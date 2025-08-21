class Condition{
	public static cond(String laptopCond,boolean isChargerAv){
		
		System.out.println("Laptop Condition: "+laptopCond);
		System.out.println("Is Charger Available :"+isChargerAv);
		int yWarranty=2;
		Warranty.warranty(yWarranty);
	}
}