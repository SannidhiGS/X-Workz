class Library{
	public static void main(String args[]){
		borrow("kuvempu","Kolalu",true);
		returnBook("tejaswi","kirugurina gayalligalu",false);
	}
	
	public static void borrow(String author,String title,boolean isAvailable){
		System.out.println(author+" "+title+" "+isAvailable);
	}
	
	public static void returnBook(String author,String title,boolean isReaturned){
		System.out.println(author+" "+title+" "+isReaturned);
	}
}