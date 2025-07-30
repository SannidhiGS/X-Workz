class Jacket{
	String color;
	String brand;
	char size;
	double price;
	String materialType;
	
	Jacket(){
	}
	
	Jacket(String color,String brand,char size,double price,String materialType){
		this.color=color;
		this.brand=brand;
		this.size=size;
		this.price=price;
		this.materialType=materialType;
	}
	
	public void getJacketInfo(){
		System.out.println("Color "+color);
		System.out.println("Brand "+brand);
		System.out.println("Size "+size);
		System.out.println("Price "+price);
		System.out.println("Material Type "+materialType);
	}
}