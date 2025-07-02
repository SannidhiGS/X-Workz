public class Tourism{
	static String mysorePalace = "Mysore Palace";
	static String lalbagh = "Lalbagh";
    static String kabbanPark = "kabbanPark";
    static String jogFalls = "Jog Falls"; 
    static String malpeBeach = " Malpe beech";
    static String kuppali = "Kuppali";
    static String shringeri = "Shringeri";
    static String mysoreZoo = "Mysore Zoo";
    static String halebidu = "Halebidu";
    static String belur = "Belur";
	static String shravanabelagola ="Shravanabelagola";
	static String hampi = "Hampi";
	static String badami = "Badami";
	static String aihole = "Aihole";
	static String golbumbaz = "Golbumbaz";

	static String touristPlaces[] = {mysorePalace, lalbagh, kabbanPark, jogFalls, malpeBeach, kuppali, shringeri, mysoreZoo, halebidu, belur, shravanabelagola, hampi, badami, aihole, golbumbaz};

	public static void main(String args[]){
	System.out.println("The number of Tourist Places "+touristPlaces.length);
	//System.out.println(touristPlaces[0]+" "+touristPlaces[1]+" "+touristPlaces[2]+" "+touristPlaces[3]+" "+touristPlaces[4]+" "+touristPlaces[5]+" "+touristPlaces[6]+" "+touristPlaces[7]+" "+touristPlaces[8]+" "+touristPlaces[9]);
	for(String tour:touristPlaces){
		System.out.println(tour);
	}
	}
}