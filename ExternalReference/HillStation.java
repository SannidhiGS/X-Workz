class HillStation {
    public static void main(String args[]) {
		String club="ClubMahindraMadikeri";
		String atitya="Atitya";
		String satkara="Satkara Chikmagalur";
		String tamara="TheTamaraCoorg";
		String nativ="OurNativeVillage";
		String brook="SilverBrookEstate";
		String serai="TheSeraiChikmagalur";
        String resorts[] = {club,atitya,satkara,tamara,nativ,brook,serai};
        System.out.println("The number of resorts " + resorts.length);
        //System.out.println(resorts[0]+" "+ resorts[1]+" "+resorts[2]+" "+resorts[3]+" "+resorts[4]+" "+resorts[5]+" "+resorts[6]);
        for(String resort:resorts){
				System.out.println(resort);
		}
	}
}
