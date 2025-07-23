class LinkedInRunner{

	public static void main(String args[]){
			
		String email="honeyJenu@gmail.com";
		String password="45baba85";
		long phno=9867453489L;
		
		LinkedIn.logIn(email,password);
		LinkedIn.logIn(phno,password);
		
		System.out.println("The email is "+email);
		System.out.println("The password is "+password);
		System.out.println("The phno is "+phno);
		
		}
}