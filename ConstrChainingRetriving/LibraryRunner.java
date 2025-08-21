class LibraryRunner{
	public static void main(String lib[]){
		
		Book book = new Book("B001", 100, true);
		Shelf shelf = new Shelf("12H1", 12, true, book);
		Library library = new Library("Baba Saheb Library", 1, 25, 2000, shelf);

		shelf.book=book;
		library.getLibraryDetails();
	
	}
}