class Cracker {
    String name;
    String type;
    String brand;
    double price;
    int quantityPerPack;
    String safetyStandard;
    boolean isSoundCracker;
    String manufacturingLocation;

    Cracker(){
		
	}
	Cracker(String name){
		this.name=name;
	}
	Cracker(String type,String brand){
		this.type=type;
		this.brand=brand;
	}
	Cracker(double price,
    int quantityPerPack){
		this.price=price;
		this.quantityPerPack=quantityPerPack;
	}
	Cracker(String safetyStandard,
    boolean isSoundCracker,
    String manufacturingLocation){
		this.safetyStandard=safetyStandard;
		this.isSoundCracker=isSoundCracker;
		this.manufacturingLocation=manufacturingLocation;
	}

    void getCrackerInfo() {
        System.out.println("Name: " + name + ", Type: " + type + ", Brand: " + brand + ", Price: ₹" + price + ", Qty/Pack: " + quantityPerPack +
                ", Safety: " + safetyStandard + ", Sound: " + isSoundCracker + ", Location: " + manufacturingLocation);
    }
}
