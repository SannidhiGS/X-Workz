class Book{
	
	String bookId;
	int noOfBooks;
	boolean isBookAvailabel;
	
	Book(String bookId,int noOfBooks,boolean isBookAvailabel){
		this.bookId=bookId;
		this.noOfBooks=noOfBooks;
		this.isBookAvailabel=isBookAvailabel;
	}
	
	public  void getBookDet(){
	
		System.out.println("The ID of the book :"+bookId);
		System.out.println("No of books: "+noOfBooks);
		System.out.println("Is the book available: "+isBookAvailabel);
	}




}