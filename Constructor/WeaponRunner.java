class WeaponRunner {
    public static void main(String args[]) {
        System.out.println("Main Started - Weapon Collection Display");

        Weapon weapon1 = new Weapon();
        weapon1.weaponId = 1;
        weapon1.type = "Sword";
        weapon1.material = "Steel";
        weapon1.weightKg = 1.5;
        weapon1.caliberOrAmmoType = "N/A";
        weapon1.rangeMeters = 2.0;
        weapon1.price = 150.00;
		weapon1.getWeaponInfo();

        Weapon weapon2 = new Weapon();
        weapon2.weaponId = 2;
        weapon2.type = "Bow";
        weapon2.material = "Wood Composite";
        weapon2.weightKg = 1.0;
        weapon2.caliberOrAmmoType = "Arrow";
        weapon2.rangeMeters = 50.0;
        weapon2.price = 200.00;
		weapon2.getWeaponInfo();

        Weapon weapon3 = new Weapon();
        weapon3.weaponId = 3;
        weapon3.type = "Pistol";
        weapon3.material = "Polymer";
        weapon3.weightKg = 0.8;
        weapon3.caliberOrAmmoType = "9mm";
        weapon3.rangeMeters = 25.0;
        weapon3.price = 500.00;
weapon3.getWeaponInfo();

        Weapon weapon4 = new Weapon();
        weapon4.weaponId = 4;
        weapon4.type = "Axe";
        weapon4.material = "Steel/Wood";
        weapon4.weightKg = 2.0;
        weapon4.caliberOrAmmoType = "N/A";
        weapon4.rangeMeters = 1.5;
        weapon4.price = 80.00;

        weapon4.getWeaponInfo();
        Weapon weapon5 = new Weapon();
        weapon5.weaponId = 5;
        weapon5.type = "Rifle";
        weapon5.material = "Steel/Wood";
        weapon5.weightKg = 3.5;
        weapon5.caliberOrAmmoType = ".308";
        weapon5.rangeMeters = 500.0;
        weapon5.price = 1200.00;

       weapon5.getWeaponInfo();
        Weapon weapon6 = new Weapon();
        weapon6.weaponId = 6;
        weapon6.type = "Dagger";
        weapon6.material = "Steel";
        weapon6.weightKg = 0.3;
        weapon6.caliberOrAmmoType = "N/A";
        weapon6.rangeMeters = 1.0;
        weapon6.price = 45.00;

        weapon6.getWeaponInfo();

        Weapon weapon7 = new Weapon();
        weapon7.weaponId = 7;
        weapon7.type = "Shotgun";
        weapon7.material = "Steel/Polymer";
        weapon7.weightKg = 3.0;
        weapon7.caliberOrAmmoType = "12 Gauge";
        weapon7.rangeMeters = 30.0;
        weapon7.price = 700.00;

        weapon7.getWeaponInfo();

        Weapon weapon8 = new Weapon();
        weapon8.weaponId = 8;
        weapon8.type = "Crossbow";
        weapon8.material = "Aluminum/Wood";
        weapon8.weightKg = 2.5;
        weapon8.caliberOrAmmoType = "Bolt";
        weapon8.rangeMeters = 80.0;
        weapon8.price = 350.00;

        weapon8.getWeaponInfo();
        Weapon weapon9 = new Weapon();
        weapon9.weaponId = 9;
        weapon9.type = "Spear";
        weapon9.material = "Wood/Steel";
        weapon9.weightKg = 2.2;
        weapon9.caliberOrAmmoType = "N/A";
        weapon9.rangeMeters = 3.0;
        weapon9.price = 90.00;

        weapon9.getWeaponInfo();

        Weapon weapon10 = new Weapon();
        weapon10.weaponId = 10;
        weapon10.type = "Revolver";
        weapon10.material = "Steel";
        weapon10.weightKg = 1.1;
        weapon10.caliberOrAmmoType = ".357 Magnum";
        weapon10.rangeMeters = 35.0;
        weapon10.price = 600.00;

        weapon10.getWeaponInfo();

        Weapon weapon11 = new Weapon();
        weapon11.weaponId = 11;
        weapon11.type = "Katana";
        weapon11.material = "Folded Steel";
        weapon11.weightKg = 1.2;
        weapon11.caliberOrAmmoType = "N/A";
        weapon11.rangeMeters = 1.8;
        weapon11.price = 400.00;

        weapon11.getWeaponInfo();

        Weapon weapon12 = new Weapon();
        weapon12.type = "Slingshot";
        weapon12.material = "Wood/Rubber";
        weapon12.weightKg = 0.2;
        weapon12.caliberOrAmmoType = "Small stones/pellets";
        weapon12.rangeMeters = 10.0;
        weapon12.price = 15.00;

        weapon12.getWeaponInfo();

        Weapon weapon13 = new Weapon();
        weapon13.weaponId = 13;
        weapon13.type = "Club";
        weapon13.material = "Wood";
        weapon13.weightKg = 2.5;
        weapon13.caliberOrAmmoType = "N/A";
        weapon13.rangeMeters = 1.0;
        weapon13.price = 30.00;

        weapon13.getWeaponInfo();

        Weapon weapon14 = new Weapon();
        weapon14.weaponId = 14;
        weapon14.type = "Submachine Gun";
        weapon14.material = "Steel/Polymer";
        weapon14.weightKg = 2.8;
        weapon14.caliberOrAmmoType = ".45 ACP";
        weapon14.rangeMeters = 100.0;
        weapon14.price = 900.00;

        weapon14.getWeaponInfo();

        Weapon weapon15 = new Weapon();
        weapon15.weaponId = 15;
        weapon15.type = "Grenade Launcher";
        weapon15.material = "Aluminum";
        weapon15.weightKg = 5.0;
        weapon15.caliberOrAmmoType = "40mm Grenade";
        weapon15.rangeMeters = 400.0;
        weapon15.price = 2500.00;

        weapon15.getWeaponInfo();

        System.out.println("Main Ended - Weapon Collection Display Complete");
    }
}