class Seller{
	static String sName="Ajay";
	static String sEmail="ajayajju@gmail.com";
	static long sPh=897877689L;
	static String iDate;
	static String iTo;
	public static void seller(String sName,String sEmail,long sPh){
		System.out.println("Seller name: "+sName);
		System.out.println("Seller mail id"+sEmail);
		System.out.println("Seller Phone: "+sPh);
		Issue.issue(iDate,iTo);
	}
}