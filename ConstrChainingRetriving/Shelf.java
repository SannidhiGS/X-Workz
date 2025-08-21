class Shelf{
	String shelfId;
	int noOfShelfs;
	boolean isShelfClean;
	Book book;
	
	Shelf(String shelfId,int noOfShelfs,boolean isShelfClean,Book book){
		this.shelfId=shelfId;
		this.noOfShelfs=noOfShelfs;
		this.isShelfClean=isShelfClean;
		this.book=book;
	}
	
	public void getShelfData(){
		System.out.println("The shelf ID is "+shelfId);
		System.out.println("The no of shelfs "+noOfShelfs);
		System.out.println("The shelf is clean "+isShelfClean);
		
		this.book.getBookDet();
	}
}