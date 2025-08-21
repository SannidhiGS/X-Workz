class Evidence{
	static long sms;
	static long call;
	static String app;
	public static void report(int pMrp,int chaMrp){
		pMrp=120;
		chaMrp=150;
		System.out.println("The actual MRP: "+pMrp);
		System.out.println("The changed MRP: "+chaMrp);
		Complaint.option(sms,call,app);
	}
}