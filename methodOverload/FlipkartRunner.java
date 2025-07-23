class FlipkartRunner{

	public static void main(String args[]){
			
		String email="harekrishna@gmail.com";
		String password="harinama@123";
		long phno=9878679867L;
		
		LinkedIn.logIn(email,password);
		LinkedIn.logIn(phno,password);
		
		System.out.println("The email is "+email);
		System.out.println("The password is "+password);
		System.out.println("The phno is "+phno);
		
		}
}