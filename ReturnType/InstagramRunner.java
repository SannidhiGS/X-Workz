class InstagramRunner {
	public static void main(String args[]){
		boolean isUserRegistered = Instagram.userRegistered("Alice","alice@gmail.com","pass123","pass123","9876543210");
		if(isUserRegistered){
			Instagram.userDet();
		}
	}
}