class Traffic{
	public static void main(String args[]){
		junctions("Jayanagar","Vijayanagra","kalasipalya");
		camera(true,true,false);
		}
	
	public static void junctions(String place1,String place2,String place3){
		System.out.println("The firt junction is"+place1);
		System.out.println("The second junction is"+place2);
		System.out.println("The third place is"+place3);
	}
	public static void camera(boolean isCcThere,boolean isCcworking,boolean isCcUpdated){
		System.out.println("Is the CC cameras are there:"+isCcThere);
		System.out.println("Is the CC Cameras are working:"+isCcworking);
		System.out.println("Is the Cc camere is updated:"+isCcUpdated);
	}
}