class Theatre{
	public static void shows(String Tname,String location,int capacity){
		System.out.println("The name of the theatre: "+Tname);
		System.out.println("The location of the theatre is: "+location);
		System.out.println("The capacity of the thetre is "+capacity);
		int durationz=2;
		int interval=20;
		ShowTime.shows(durationz,interval);
	}
}