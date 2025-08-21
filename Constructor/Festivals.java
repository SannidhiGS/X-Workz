class Festivals {
    String name;
    String mainReligionCulture;
    String typicalSeason; 
    int approximateDurationDays;
    String primaryCelebrationActivity; 
    String geographicalFocus; 
	
	public void getFestInfo(){
		System.out.println("Name: " + name);
        System.out.println("Main Religion/Culture: " + mainReligionCulture);
        System.out.println("Typical Season: " + typicalSeason);
        System.out.println("Approximate Duration (Days): " + approximateDurationDays);
        System.out.println("Primary Celebration Activity: " + primaryCelebrationActivity);
        System.out.println("Geographical Focus: " + geographicalFocus);
	}
}
