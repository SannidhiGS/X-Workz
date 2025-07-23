class JioHotstarRunner{

	public static void main(String args[]){
			
		String email="sannidhisanni@gmail.com";
		String password="Sanni8@123";
		long phno=9535812585L;
		
		LinkedIn.logIn(email,password);
		LinkedIn.logIn(phno,password);
		
		System.out.println("The email is "+email);
		System.out.println("The password is "+password);
		System.out.println("The phno is "+phno);
		
		}
}