class TeckParkRunner{

	public static void main(String args[]){
	
	
		
		Company company=new Company(150000,"ND TV national Award");
		
			
		
		Block block=new Block(20,true, company);
		
		System.out.println(block.company);
	
		TeckPark techPark=new TeckPark(89,"Manyata Tech Park",150, block);
		
		block.company=company;
		
		
		
		techPark.getTechParkDetail();
	
	}


}