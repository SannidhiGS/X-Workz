class Library {
    public static void main(String args[]) {
        String bookNames[] = {"MalegalalliMadumagalu", "ChomanaDudi", "MookajjiyaKanasugalu", "Samskara", "Parva", "KanooruHeggadithi", "BhyravaGeethe", "RudraPrayagadaBhyanakaNaraBhakshaka"};
        System.out.println("The number of books " + bookNames.length);
        //System.out.println(bookNames[0] + " " + bookNames[1] + " " +bookNames[2]+" "+ bookNames[3]+ " " + bookNames[4] + " " +bookNames[5] + " " + bookNames[6]+ " " + bookNames[7]);
		for(String bookName:bookNames){
			System.out.println(bookName);
		}
	}
}
