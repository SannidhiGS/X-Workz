class Screen{

	String screenId;
	boolean isScreenVisible;
	
	Movie movie;
	
	Screen(String screenId,boolean isScreenVisible,Movie movie){
		this.screenId=screenId;
		this.isScreenVisible=isScreenVisible;
		
		this.movie=movie;
	
	}
	public void getScreenDetails(){
		System.out.println("The screen ID "+screenId);
		System.out.println("The screen is visible "+isScreenVisible);
		
		this.movie.getMovieDetails();
	}
}