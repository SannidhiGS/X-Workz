class City{
	static int pincodes[]={577201,577301,577401,577427,577429,577418,577432,577211,577548,577452,577126,577220,577430,577216};
	public static void main(String pins[]){
	System.out.println("The total number of pincodes"+pincodes.length);
	//System.out.println(pincodes[0]+" "+pincodes[1]+""+pincodes[3]+" "+pincodes[4]+" "+pincodes[5]+" "+pincodes[6]+" "+pincodes[7]+" "+pincodes[8]+" "+pincodes[9]+" "+pincodes[10]+" "+pincodes[11]+" "+pincodes[12]+" "+pincodes[13]);
	for(int pincode:pincodes){
		System.out.println(pincode);
	}
	}
}