class IPL{
	public static void main(String args[]){
	String rcb="RCB";
	String pune="Pune Warriors";
	String csk="CSK";
	String mi="MI";
	String rr="RR";
	String dc="DC";
	String gt="GT";
	String lsg="LSG";
	String pk="PK";
	String sh="SH";
	String teams[]={rcb,pune,csk,mi,rr,dc,gt,lsg,pk,sh};
	
		System.out.println("The number of teams in the IPL"+teams.length);
		//System.out.println(teams[0]+" "+teams[1]+" "+teams[3]+" "+teams[4]+" "+teams[5]+" "+teams[6]+" "+teams[7]+" "+teams[8]+" "+teams[9]);
		for(String team:teams){
			System.out.println(team);
		}
			
	}
}