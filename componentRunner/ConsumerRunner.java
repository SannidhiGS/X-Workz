class ConsumerRunner{
	static String storeName;
	static boolean isBill;
	public static void main(String args[]){
		System.out.println("The main started");
		Consumer.hPrice(storeName,isBill);
		System.out.println("The main ended");
	}
}