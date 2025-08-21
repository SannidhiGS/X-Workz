class Library{
	String libraryName;
	int libraryID;
	int noOfShelf;
	int noOfBook;
	
	Shelf shelf;
	
	Library(String libraryName,int libraryID,int noOfShelf,int noOfBook,Shelf shelf){
		this.libraryName=libraryName;
		this.libraryID=libraryID;
		this.noOfShelf=noOfShelf;
		this.noOfBook=noOfBook;
		this.shelf=shelf;
	}
	
	public  void  getLibraryDetails(){
		System.out.println("The library name :"+libraryName);
		System.out.println("The libray ID :"+libraryID);
		System.out.println("No of shelfs: "+noOfShelf);
		System.out.println("No of Books: "+noOfBook);
		
		this.shelf.getShelfData();
	}
}