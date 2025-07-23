class SnapChatRunner{

	public static void main(String args[]){
			
		String email="shabareeshshabbi@gmail.com";
		String password="Shabbi@123";
		long phno=9606760054L;
		
		LinkedIn.logIn(email,password);
		LinkedIn.logIn(phno,password);
		
		System.out.println("The email is "+email);
		System.out.println("The password is "+password);
		System.out.println("The phno is "+phno);
		
		}
}