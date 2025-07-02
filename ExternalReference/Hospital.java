class Hospital {
    public static void main(String args[]) {
		String kumar="Dr.AshokKumar";
		String verma="Dr.NehaVerma";
		String patil="Dr.RajeshPatil";
		String mehta="Dr.PriyaMehta";
		String singh="Dr.AmitSingh";
		String sharma="Dr.SwatiSharma";
		String reddy="Dr.SureshReddy";
		String desai="Dr.AnitaDesai";
		String rao="Dr.VikramRao";
		String joshi="Dr.RekhaJoshi";
        String doctorNames[]={kumar,verma,patil,mehta,singh,sharma,reddy,desai,rao,joshi};
        System.out.println("The number of doctors " + doctorNames.length);
        //System.out.println(doctorNames[0]+" "+doctorNames[1]+" "+doctorNames[2] +" "+doctorNames[3]+" "+doctorNames[4] + " " +doctorNames[5] + " " +doctorNames[6] +" "+doctorNames[7] + " " + doctorNames[8] + " " + doctorNames[9]);
		for(String docterName:doctorNames){
			System.out.println(docterName);
		}
	}
}
