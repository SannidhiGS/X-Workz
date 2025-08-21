class PassportSevaRunner{
	public static void main(String args[]){
		boolean isUserRegistered=PassportSeva.isPass("Sannidhi","Shetty","Sannidhi@129","Sannidhi@123");
		System.out.println("Is user registered "+isUserRegistered);
		
		if(isUserRegistered)
		PassportSeva.userDetails();
	}
}