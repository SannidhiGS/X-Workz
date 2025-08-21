class FrndAppRunner{
	/*static String names;
	static String mobiles;
	static boolean isUserRegistered;*/
	public static void main(String arg[]){
		boolean isUserRegistered=FrndApp.userRegistered("Sannidhi","9535812585");
		System.out.println("Is user registered: "+isUserRegistered);
		FrndApp.userDetail();		
	}
}