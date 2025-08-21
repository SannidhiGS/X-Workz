class Bar{
	public static void bar(String[] alcNames){
	System.out.println("The number of brands "+alcNames.length);
		//System.out.println(alcNames[0]+" "+alcNames[1]+" "+alcNames[2]+" "+alcNames[3]+" "+alcNames[4]+" "+alcNames[5]+" "+alcNames[6]+" "+alcNames[7]+" "+alcNames[8]+" "+alcNames[9]+" "+alcNames[10]+" "+alcNames[11]);
		for(String alcName:alcNames){
			System.out.println(alcName);
		}
	}
}