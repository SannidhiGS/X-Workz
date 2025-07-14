class FacebookRunner{
	public static void main(String args[]){
	boolean isUserRegistered=Facebook.userRegistered("Honey","honeyhoneyjenu@gmail.com","Honey","Honey","9876789878");
	
	if(isUserRegistered){
		Facebook.userDet();
		}
	}
}