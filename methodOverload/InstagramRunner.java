class InstagramRunner{

	public static void main(String args[]){
			
		String email="ramanarayana.com";
		String password="Ramara@123";
		long phno=9481174030L;
		
		LinkedIn.logIn(email,password);
		LinkedIn.logIn(phno,password);
		
		System.out.println("The email is "+email);
		System.out.println("The password is "+password);
		System.out.println("The phno is "+phno);
		
		}
}