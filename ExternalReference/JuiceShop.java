public class JuiceShop{
	static String appleCider = "Apple cider";
    static String appleJuice = "Apple Juice";
	static String cherryJuice = "Cherry Juice";
	static String orangeJuice = "Orange Juice";
	static String tomatoJuice = "Tomato Juice";
	static String cranberryJuice = "Cranberry Juice";
	static String papayaJuice = "Papaya Juice";
	static String abcJuice = "ABC juice";
	static String amlaJuice = "Amla Juice";
	static String grapeJuice = "Grape Juice";
	static String lemonJuice = "Lemon Juice";
	static String pomegranateJuice = "Pomogranate Juice";
	static String pineappleJuice = "Pineapple Juice";
	static String tamarindJuice = "Tamrind Juice";
	static String sweetLemonJuice = "Sweet lemon Juice";
	static String watermelonJuice = "Watermelon Juice";

static String juices[] = {
    appleCider, appleJuice, cherryJuice, orangeJuice, tomatoJuice,cranberryJuice, papayaJuice, abcJuice, amlaJuice, grapeJuice,lemonJuice, pomegranateJuice, pineappleJuice, tamarindJuice,sweetLemonJuice, watermelonJuice
};

	public static void main(String juice[]){
		System.out.println("The number of juice"+juices.length);
		//System.out.println(juices[0]+" "+juices[1]+" "+juices[2]+" "+juices[3]+" "+juices[4]+" "+juices[5]+" "+juices[6]+" "+juices[7]+" "+juices[8]+" "+juices[9]+" "+juices[10]+" "+juices[11]+" "+juices[12]+" "+juices[13]+" "+juices[14]);
		for(String Sharabath:juices){
			System.out.println(Sharabath);
		}
	}
}