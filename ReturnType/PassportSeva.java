class PassportSeva{
	static String gName;
	static String surName;
	static String passWord;
	static String confirmPassword;
	
	public static boolean isPass(String gNe,String surNe,String passWd,String confirmPd){
		boolean nameRegistered=false;
		boolean surNameRegistered=false;
		boolean passWordRegistered=false;
		boolean confirmPasswordRegisterd=false;
		boolean isUserRegistered=false;
		
		if(gNe!=null){
			gName=gNe;
		    nameRegistered=true;
		}
		else{
		System.out.println("Give the proper user name");
		}
		
		if(surNe!=null){
			surName=surNe;
			surNameRegistered=true;
		}
		else{
		System.out.println("give proper sur name ");
		}
		
		if(passWd!=null){
			passWord=passWd;
			passWordRegistered=true;
		}
		else{
		System.out.println("Incorrect password");
		}
		
		if(confirmPd!=null && passWd==confirmPd){
			confirmPassword=confirmPd;
			confirmPasswordRegisterd=true;
		}
		else{
			System.out.println("Incorrect password");
		}
		
		if(nameRegistered && surNameRegistered && passWordRegistered && confirmPasswordRegisterd){
			isUserRegistered=true;
			System.out.println("The user registered ");
		}
		else{
			System.out.println("The user not registered");
		}
	return isUserRegistered;
	}
		public static void userDetails(){
			System.out.println("The user name"+gName);
			System.out.println("Sur name"+surName);
			System.out.println("password"+passWord);
			System.out.println("Confirm"+confirmPassword);
		}
}