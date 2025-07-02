class PavitraCollections{
	static String lotus = "Lotus";
	static String nyka = "Nyka";
	static String facesCanada = "FacesCanada";
	static String nyb = "NYB";
	static String maybellian = "Maybellian";
	static String loreal = "Loreal";
	static String himalaya = "Himalaya";
	static String apollo = "Apollo";
	static String dazeller = "Dazeller";
	static String lakeme = "Lakeme";
    static String brand[] = {lotus,nyka,facesCanada, nyb, maybellian, loreal, himalaya,apollo,dazeller,lakeme};

	public static void main(String brands[]){
		System.out.println("The total number of brands "+brand.length);
		//System.out.println(brand[0]+" "+brand[1]+" "+brand[2]+" "+brand[3]+" "+brand[4]+" "+brand[5]+" "+brand[6]+" "+brand[7]+" "+brand[8]+" "+brand[9]);
		for(String bradz:brand){
			System.out.println(bradz);
		}
	}
}