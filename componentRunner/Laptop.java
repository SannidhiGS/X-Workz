class Laptop{
	static String sName="Ajay";
	static String sEmail="ajayajju@gmail.com";
	static long sPh=897877689L;
	public static void laptop(String bName,String processor,String genaration){
		bName="HP laptop";
		processor="i7";
		genaration="windows 11";
		System.out.println(bName);
		System.out.println(processor);
		System.out.println(genaration);
		Seller.seller(sName,sEmail,sPh);
	}
}