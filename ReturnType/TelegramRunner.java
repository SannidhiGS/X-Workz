class TeleRunner{
	public static void main(String args[]){
		boolean isUserRegistered = Telegram.userRegistered("shobitha","shobitha@gmail.com","telegram123","telegram123","9812345678");
		if(isUserRegistered){
			Telegram.userDet();
		}
	}
}
