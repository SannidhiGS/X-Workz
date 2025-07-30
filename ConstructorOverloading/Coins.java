class Coins {
    String name;
    String country;
    int year;
    String material;
    double weight;
    double value;
	
	
	Coins(){
				
	}
	Coins(String name){
		this.name=name;		
	}
	Coins(String country,int year){
		this.country=country;
		this.year=year;
	}
	Coins(String material,double weight){
		this.material=material;
		this.weight=weight;
	}
	Coins(double value){
		this.value=value;		
	}
		
	
	public void getCoinsInfo(){
		System.out.println("the name is "+name);
		System.out.println("the country is "+country);
		System.out.println("the year is "+year);
		System.out.println("the material is "+material);
		System.out.println("the weight is "+weight);
		System.out.println("the value is "+value);
	
		
	}
}
