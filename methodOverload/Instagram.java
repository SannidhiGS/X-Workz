class Instagram{
	public static void logIn(String email,String password){
		boolean isEmail=false;
		boolean isPassword=false;
		
		if(email!=null){
			isEmail=true;
		}
		else{
			System.out.println("Enter the email");
		}
		if(password!=null && password.length()>=8){
			isPassword=true;
		}
		else{
			System.out.println("Enter the correct password");
		}
	}
	public static void logIn(long phno,String password){
		boolean isPhno=false;
		boolean isPassword=false;
		
		if(phno!=0){
			isPhno=true;
		}
		else{
			System.out.println("Enter the email");
		}
		if(password!=null && password.length()>=8){
			isPassword=true;
		}
		else{
			System.out.println("Enter the correct password");
		}
	}
}