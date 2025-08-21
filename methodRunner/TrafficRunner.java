class TrafficRunner{
	public static void main(String args[]){
		String place1="Jayanagar";
		String place2="Vijayanagra";
		String place3="kalasipalya";
		Traffic.junctions("Jayanagar","Vijayanagra","kalasipalya");
		
		boolean isCcThere=true;
		boolean isCcworking=true;
		boolean isCcUpdated=false;
		Traffic.camera(true,true,false);
		}
}