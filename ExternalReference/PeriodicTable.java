class PeriodicTable {
    public static void main(String args[]) {
        static String hydrogen = "Hydrogen";
		static String helium = "Helium";
		static String lithium = "Lithium";
		static String beryllium = "Beryllium";
		static String boron = "Boron";
		static String carbon = "Carbon";
		static String nitrogen = "Nitrogen";
		static String oxygen = "Oxygen";
		static String fluorine = "Fluorine";
		static String neon = "Neon";
		static String sodium = "Sodium";
		static String magnesium = "Magnesium";

static String elements[] = {hydrogen,helium,lithium,beryllium,boron,carbon,nitrogen,oxygen, fluorine, neon, sodium,  magnesium};

        System.out.println("The number of elements " + elements.length);
        //System.out.println(elements[0] + " " + elements[1] + " " + elements[2] + " " + elements[3] +" "+ elements[4] +" " +elements[5] +" "+elements[6]+" "+ elements[7]+" " + elements[8]+ " "+elements[9]+" "+elements[10]+" "+elements[11]);
		for(String element:elements){
			System.out.println(element);
		}
	}
}
