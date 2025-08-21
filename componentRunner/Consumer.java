class Consumer{
	static int pMrp;
	static int chaMrp;
	public static void hPrice(String storeName,boolean isBill){
		storeName="Balaji general store";
		isBill=true;
		System.out.println("The store name :"+storeName);
		System.out.println("Is the bill given "+isBill);
		Evidence.report(pMrp,chaMrp);
	}
}