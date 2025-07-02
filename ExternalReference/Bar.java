class Bar{
	static String budiswar="Budwisara";
	static String kingfisher="Kingfisher";
	static String tur="tuborg";
	static String bir="bira";
	static String cor="corona";
	static String mac="The machalen";
	static String sig="Signature";
	static String roy="Royal Challengers";
	static String ori="Original Choice";
	static String royal="Royal Stag";
	static String blue="Imperial Blue";
	static String office="OfficersChoice";
	static String cir="Ciroc";
	static String alcNames[]={budiswar,kingfisher,tur,bir,cor,mac,sig,roy,ori,royal,blue,office,cir};
	public static void main(String tight[]){
		System.out.println("The number of brands "+alcNames.length);
		//System.out.println(alcNames[0]+" "+alcNames[1]+" "+alcNames[2]+" "+alcNames[3]+" "+alcNames[4]+" "+alcNames[5]+" "+alcNames[6]+" "+alcNames[7]+" "+alcNames[8]+" "+alcNames[9]+" "+alcNames[10]+" "+alcNames[11]);
		for(String alcName:alcNames){
			System.out.println(alcName);
		}
		
	}
}