class  Earth{
	static String as="Asia";
	static String ant="Antartica";
	static String eur="Europe";
	static String af="Africa";
	static String aus="Australia";
	static String  north="North America";
	static String south="South America";
	static String continents[]={aus,ant,eur,af,aus,north,south};
	public static void main(String cont[]){
	System.out.println("The number of Continents"+continents.length);
	//System.out.println(continents[0]+" "+continents[1]+" "+continents[2]+" "+continents[3]+" "+continents[4]+" "+continents[5]+" "+continents[6]);
	for(String continent:continents){
		System.out.println(continent);
	}
	}
}