class Movie{
	public static void movie(String name,int duration,String rating){
		System.out.println("The name of the movie "+name);
		System.out.println("Duration of the movie "+duration);
		System.out.println("Rating of the movie "+rating);
		
		String tName="Bhagyalaxmi Theatre";
		String location="Koramangala";
		int capacity=300;
		Theatre.shows(tName,location,capacity);	
	}
}