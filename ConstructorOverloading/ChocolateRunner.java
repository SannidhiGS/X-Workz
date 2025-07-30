class ChocolateRunner{
	
	public static void main(String args[]){
		String ingredients1[]={"Sugar","Milk Solid","Coco","Milk"};
		Chocolate chocolate=new Chocolate();
		chocolate.chocolateId=1;
		chocolate.brand="Cadbory";
		chocolate.price=199.00;
		chocolate.ingredients=ingredients1;
		chocolate.name="DairyMilk";
		chocolate.getChocolateDetails();
	}

}