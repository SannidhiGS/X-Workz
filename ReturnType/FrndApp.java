class FrndApp{
	static String names="sannidhi";
	static String mobiles="9535812585";
	
	public static boolean userRegistered(String userNames,String userMobile){
		boolean isNameValid=false;
		boolean isMobileValid=false;
		boolean isUserRegistered=false;
		if(names!=null){
			names=userNames;
			isNameValid=true;
		}
		
		if(mobiles!=null){
			mobiles=userMobile;
			isMobileValid=true;
		}
		
		if(isNameValid && isMobileValid){
			isUserRegistered=true;
		}
		return isUserRegistered;
	}
	public static void userDetail(){
		System.out.println("The user name: "+names);
		System.out.println("The user mobile: "+mobiles);
	}
}
	