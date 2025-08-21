class LibraryRunner{
	public static void main(String args[]){
		String author="kuvempu";
		String title="Kolalu";
		boolean isAvailable=true;
		Library.borrow("kuvempu","Kolalu",true);
		
		String author1="tejaswi";
		String title1="kirugurina gayalligalu";
		boolean isReaturned=false;
		Library.returnBook("tejaswi","kirugurina gayalligalu",false);
	}
}