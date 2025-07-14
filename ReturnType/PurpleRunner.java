class PurpleRunner {
	public static void main(String args[]){
		boolean isUserRegistered = Purple.userRegistered("Ganavi","ganu@gmail.com","purple@pass","purple@pass","9908776655");
		if(isUserRegistered){
			Purple.userDet();
		}
	}
}
