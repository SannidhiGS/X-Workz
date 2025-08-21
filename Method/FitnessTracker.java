class FitnessTracker{
	public static void main(String args[]){
		workout("lunges","12mg",2);
	}
	public static void workout(String type,String calories,int durationHrs){
		System.out.println(type+" "+calories+" "+durationHrs);		
	}
}