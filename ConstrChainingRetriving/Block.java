class Block{
	
	int noOfBlocks;
	boolean isAllBlockFill;
	
	Company company;
	
	Block(int noOfBlocks,boolean isAllBlockFill,Company company){
		this.noOfBlocks=noOfBlocks;
		this.isAllBlockFill=isAllBlockFill;
		
		this.company=company;
	
	}
	
	public void getBlockDetails(){
		
		System.out.println("The no of blocks: "+noOfBlocks);
		System.out.println("Is all the Block filled: "+isAllBlockFill);
		
		this.company.getCompanyDetails();
	}

}