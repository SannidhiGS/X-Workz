class GiTag {
    String name; 
    String category; 
    String geographicalArea; 
    int registrationYear;
    String description; 
    String registeredHolder; 
	
	public void getGiInfo(){
		System.out.println("Name: " +name);
        System.out.println("Category: " + category);
        System.out.println("Geographical Area: " + geographicalArea);
        System.out.println("Registration Year: " + registrationYear);
        System.out.println("Description: " + description);
        System.out.println("Registered Holder: " + registeredHolder);
        System.out.println();
	}
}
