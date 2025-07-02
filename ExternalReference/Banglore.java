class Banglore{
	
		static String rajajinagar="Rajajinagara";
		static String jpnagar="J.P nagar";
		static String jayanagar="Jayanagara";
		static String sadashiva="SadaShivaNaagra";
		static String shivajinagar="ShivajiNagara";
		public static void main(String args[]){
		String areaNames[]={rajajinagar,jpnagar,jayanagar,sadashiva,shivajinagar};
		
		System.out.println("The total number of area "+areaNames.length);
		//System.out.println(areaNames[0]+" "+areaNames[1]+" "+areaNames[2]+" "+areaNames[3]);
		for(String areaName:areaNames){
			System.out.println(areaName);
		}
	}
}