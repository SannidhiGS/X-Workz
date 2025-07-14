class TwitterRunner {
	public static void main(String args[]){
		boolean isUserRegistered = Twitter.userRegistered("Bob","bob@gmail.com","bobpass","bobpass","9123456789");
		if(isUserRegistered){
			Twitter.userDet();
		}
	}
}