class Blade {
	int bladeId;
    String brand;
    String type;
    String size;
    double price;
    boolean isStainlessSteel;
    String usage;
	
	Blade(){	
			System.out.println("The constructor is invoked");	
		}
	Blade(int bladeId){	
			this.bladeId=bladeId;	
		}
	Blade(String brand,String type){	
			this.brand=brand;
			this.type=type;
		}
	Blade(String size,double price){	
			this.size=size;
			this.price=price;
		}
	Blade(boolean isStainlessSteel,String usage){	
			this.isStainlessSteel=isStainlessSteel;
			this.usage=usage;
		}
	
	public void getBladeInfo(){
	System.out.println("brand: " + brand);
        System.out.println(".type: " + type);
        System.out.println("size: " +size);
        System.out.println("price: " + price);
        System.out.println("isStainlessSteel: " + isStainlessSteel);
        System.out.println("usage: " + usage);
}
}
