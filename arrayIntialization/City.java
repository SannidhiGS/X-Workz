class City{
	public static void city(int[] pincodes){
	System.out.println("The total number of pincodes"+pincodes.length);
	//System.out.println(pincodes[0]+" "+pincodes[1]+""+pincodes[3]+" "+pincodes[4]+" "+pincodes[5]+" "+pincodes[6]+" "+pincodes[7]+" "+pincodes[8]+" "+pincodes[9]+" "+pincodes[10]+" "+pincodes[11]+" "+pincodes[12]+" "+pincodes[13]);
	for(int pincode:pincodes){
		System.out.println(pincode);
		}
	}
}