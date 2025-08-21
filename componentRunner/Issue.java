class Issue{
	public static void issue(String iDate,String iTo){
	String iDate="12/06/2025";
	String iTo="Saniha";
	String laptopCond="New and good";
	boolean isChargerAv=true;
	System.out.println("Issue Date: "+iDate);
	System.out.println("Issued to: "+iTo);
	Condition.cond(laptopCond,isChargerAv);
	}
}