class Actor{
	public static void actor(String aName,int aAge){
		System.out.println("The actor name :"+aName);
		System.out.println("The actor age:"+aAge);
		String mainRole="Charlie named Doggie";
		String releaseYear="2022";
		boolean isMovieHit=true;
		Summary.summary(mainRole,releaseYear,isMovieHit);
	}
}