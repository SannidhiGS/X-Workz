class Casino {
	int id;
    String name;
    String location;
    boolean isOpen24Hours;
    int numberOfGames;
    boolean hasHotel;
    double entryFee;
	
	
	Casino(){
			
			System.out.println("The constructor is invoked");
			
		}
		Casino(    String name,String location,boolean isOpen24Hours,int numberOfGames,boolean hasHotel,double entryFee,String material){
			
			System.out.println("The parameterized constructor is invoked");
			
			this.name=name;
			this.location=location;
			this.isOpen24Hours=isOpen24Hours;
			this.numberOfGames=numberOfGames;
			this.hasHotel=hasHotel;
			this.entryFee=entryFee;
			
		}
		Casino(int id){
			this.id=id;	
		}
		
		Casino(String name,String location){
			this.name=name;
			this.location=location;
			
		}
		Casino(boolean isOpen24Hours,int numberOfGames){
			this.isOpen24Hours=isOpen24Hours;
			this.numberOfGames=numberOfGames;
		}
		Casino(boolean hasHotel,double entryFee,String material){
			this.hasHotel=hasHotel;
			this.entryFee=entryFee;
			this.material=material;
		}
		
	
	}
}
