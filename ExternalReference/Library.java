class Library {
    public static void main(String args[]) {
        static String malegalalliMadumagalu = "MalegalalliMadumagalu";
        static String chomanaDudi = "ChomanaDudi";
		static String mookajjiyaKanasugalu = "MookajjiyaKanasugalu";
		static String samskara = "Samskara";
		static String parva = "Parva";
		static String kanooruHeggadithi = "KanooruHeggadithi";
		static String bhyravaGeethe = "BhyravaGeethe";
		static String rudraPrayagadaBhyanakaNaraBhakshaka = "RudraPrayagadaBhyanakaNaraBhakshaka";

static String bookNames[] = { malegalalliMadumagalu,chomanaDudi, mookajjiyaKanasugalu,samskara,parva,kanooruHeggadithi,bhyravaGeethe,rudraPrayagadaBhyanakaNaraBhakshaka
};

        System.out.println("The number of books " + bookNames.length);
        //System.out.println(bookNames[0] + " " + bookNames[1] + " " +bookNames[2]+" "+ bookNames[3]+ " " + bookNames[4] + " " +bookNames[5] + " " + bookNames[6]+ " " + bookNames[7]);
		for(String bookName:bookNames){
			System.out.println(bookName);
		}
	}
}
