class YouTubeRunner {
	public static void main(String args[]){
		boolean isUserRegistered = YouTube.userRegistered("aira","aira@gmail.com","youtubePass","youtubePass","9776543210");
		if(isUserRegistered){
			YouTube.userDet();
		}
	}
}