class Movie{
	String movieID;
	String movieName;
	
	Movie(String movieID,String movieName){
		this.movieID=movieID;
		this.movieName=movieName;
	
	}
	public void getMovieDetails(){
		System.out.println("The movi ID "+movieID);
		System.out.println("The movie name "+movieName);
	}
}