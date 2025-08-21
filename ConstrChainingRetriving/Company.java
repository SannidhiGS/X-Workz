class Company{
	
	int noOfProfessionals;
	String awardName;
	
	Company(int noOfProfessionals,String awardName){
		
		this.noOfProfessionals=noOfProfessionals;
		this.awardName=awardName;
	}
	
	public void getCompanyDetails(){
	
		System.out.println("The no of professionals :"+noOfProfessionals);
		System.out.println("The award name: "+awardName);
	}

}