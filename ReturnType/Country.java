class Country{
	public static int getCountryCode(String countryName){
		int countryCode=0;
		
		if(countryName=="India"){
			countryCode=91;
		}
		else if(countryName=="Australia"){
			countryCode=61;
		}
		else if(countryName=="Sri lanka"){
			countryCode=94;
		}
		else if(countryName=="Spain"){
			countryCode=34;
		}
		else{
			System.out.println("The ivalid");
		}
		
		
		System.out.println("Country :"+countryName);
		System.out.println("Country Code: "+countryCode);
		return countryCode;
	}
}