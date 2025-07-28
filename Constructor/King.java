class King {
    String name;
    String kingdom;
    int reignStartYear;
    int reignEndYear;
    String notableAchievement;
    String capitalCity;
    String dynasty;
    boolean isHistorical;
	
	public void getKingInfo(){
	System.out.println("Name: "+name);
	System.out.println("Kingdom: "+kingdom);
	System.out.println("Start year"+reignStartYear);
	System.out.println("End year "+reignEndYear);
	System.out.println("Achivement "+notableAchievement);
	System.out.println("Capital City"+capitalCity);
	System.out.println("Dynasty "+dynasty);
	System.out.println("Is Historical? "+isHistorical);
	}
}
