class SpotiRunner{
	public static void main(String args[]){
		boolean isUserRegistered = Spotify.userRegistered("Dinesh","dineshudini@gmail.com","spotifyPass","spotifyPass","9501234567");
		if(isUserRegistered){
			Spotify.userDet();
		}
	}
}
