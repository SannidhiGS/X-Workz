class Weapon {
    int weaponId;
    String type; 
    String material;
    String caliberOrAmmoType; 
    double rangeMeters; 
    double price;
	
	public void getWeaponInfo(){
		
		
        System.out.println("Weapon ID: " + weaponId);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Weight: " + weightKg + " kg");
        System.out.println("Caliber/Ammo: " + caliberOrAmmoType);
        System.out.println("Range: " + rangeMeters + " meters");
        System.out.println("Price: $" +price);
        System.out.println();
	}
}