class SnapchatRunner {
	public static void main(String args[]){
		boolean isUserRegistered = Snapchat.userRegistered("meera","meera@gmail.com","snapchat123","snapchat123","9834567890");
		if(isUserRegistered){
			Snapchat.userDet();
		}
	}
}