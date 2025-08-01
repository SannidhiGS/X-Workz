class TeckPark{

	int techID;
	String techParkName;
	int noOfCompanies;
	
	Block block;

	TeckPark(int techID,String techParkName,int noOfCompanies,Block block){
	
		this.techID=techID;
		this.techParkName=techParkName;
		this.noOfCompanies=noOfCompanies;
		
		this.block=block;
	}
	
	public void getTechParkDetail(){
	
		System.out.println("The tech park ID: "+techID);
		System.out.println("The park name :" +techParkName);
		System.out.println("The no of companies :"+noOfCompanies);
		
		this.block.getBlockDetails();
	}
}