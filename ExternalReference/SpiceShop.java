class SpiceShop {
    
        static String turmeric = "Turmeric";
		static String coriander = "Coriander";
		static String cumin = "Cumin";
		static String mustardSeeds = "Mustard Seeds";
		static String redChiliPowder = "Red Chili Powder";
		static String garamMasala = "Garam Masala";
		static String blackPepper = "Black Pepper";
		static String cardamom = "Cardamom";
		static String cloves = "Cloves";
		static String fenugreek = "Fenugreek";
		static String jeera = "Jeera";
		static String dalchini = "Dalchini";
		static String elachi = "Elachi";
		static String dryCapsicum = "Dry capsicum";

		static String spices[] = { turmeric, coriander, cumin, mustardSeeds, redChiliPowder, garamMasala, blackPepper, cardamom, cloves, fenugreek, jeera, dalchini, elachi, dryCapsicum};
	public static void main(String spice[]) {

        System.out.println("The number of spices: " + spices.length);
       // System.out.println(spices[0]+" "+spices[1] +" "+ spices[2] +" "+spices[3]+" "+ spices[4] +" "+ spices[5] + " " +spices[6]+" "+spices[7]+" "+spices[8]+" " +spices[9]+" "+spices[10]+" "+spices[11]+" "+spices[12]+" "+spices[13]);
		for(String taste:spices){
			System.out.println(taste);
		}
	}
	
}
