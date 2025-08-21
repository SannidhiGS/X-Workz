class Blazzer {
	int blazerId;
    String brand;
    String size;
    String color;
    double price;
    boolean isFormal;
    String material;
	
	Blazzer(int blazerId){
			System.out.println("The constructor is invoked");	
		}
	
	Blazzer(String brand,String size){
			this.brand=brand;
			this.size=size;
		}
	Blazzer(String color,double price){
		this.color=color;
		this.price=price;
	}
	Blazzer(boolean isFormal){
		this.isFormal=isFormal;
	}
	Blazzer(String material){
		this.material=material;
	}
	public void getBlazzerInfo(){
		 System.out.println("brand: " + brand);
        System.out.println("size: " + size);
        System.out.println("color: " + color);
        System.out.println("price: " + price);
        System.out.println("isFormal: " + isFormal);
        System.out.println(".material: " + material);
	}
}
