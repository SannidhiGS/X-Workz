class LinkedInRunner {
	public static void main(String args[]){
		boolean isUserRegistered = LinkedIn.userRegistered("Charlie","charlie@gmail.com","linkedpass","linkedpass","9901234567");
		if(isUserRegistered){
			LinkedIn.userDet();
		}
	}
}
