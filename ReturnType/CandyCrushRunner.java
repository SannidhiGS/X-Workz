class CandyRunner {
	public static void main(String args[]){
		boolean isUserRegistered = CandyCrush.userRegistered("Shabbi","shabbi@gmail.com","candy123","candy123","9812345678");
		if(isUserRegistered){
			CandyCrush.userDet();
		}
	}
}
