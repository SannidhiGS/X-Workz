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

        System.out.println("Weapon ID: " + weapon1.weaponId);
        System.out.println("Type: " + weapon1.type);
        System.out.println("Material: " + weapon1.material);
        System.out.println("Weight: " + weapon1.weightKg + " kg");
        System.out.println("Caliber/Ammo: " + weapon1.caliberOrAmmoType);
        System.out.println("Range: " + weapon1.rangeMeters + " meters");
        System.out.println("Price: $" + weapon1.price);
        System.out.println();

        Weapon weapon2 = new Weapon();
        weapon2.weaponId = 2;
        weapon2.type = "Bow";
        weapon2.material = "Wood Composite";
        weapon2.weightKg = 1.0;
        weapon2.caliberOrAmmoType = "Arrow";
        weapon2.rangeMeters = 50.0;
        weapon2.price = 200.00;

        System.out.println("Weapon ID: " + weapon2.weaponId);
        System.out.println("Type: " + weapon2.type);
        System.out.println("Material: " + weapon2.material);
        System.out.println("Weight: " + weapon2.weightKg + " kg");
        System.out.println("Caliber/Ammo: " + weapon2.caliberOrAmmoType);
        System.out.println("Range: " + weapon2.rangeMeters + " meters");
        System.out.println("Price: $" + weapon2.price);
        System.out.println();

        Weapon weapon3 = new Weapon();
        weapon3.weaponId = 3;
        weapon3.type = "Pistol";
        weapon3.material = "Polymer";
        weapon3.weightKg = 0.8;
        weapon3.caliberOrAmmoType = "9mm";
        weapon3.rangeMeters = 25.0;
        weapon3.price = 500.00;

        System.out.println("Weapon ID: " + weapon3.weaponId);
        System.out.println("Type: " + weapon3.type);
        System.out.println("Material: " + weapon3.material);
        System.out.println("Weight: " + weapon3.weightKg + " kg");
        System.out.println("Caliber/Ammo: " + weapon3.caliberOrAmmoType);
        System.out.println("Range: " + weapon3.rangeMeters + " meters");
        System.out.println("Price: $" + weapon3.price);
        System.out.println();

        Weapon weapon4 = new Weapon();
        weapon4.weaponId = 4;
        weapon4.type = "Axe";
        weapon4.material = "Steel/Wood";
        weapon4.weightKg = 2.0;
        weapon4.caliberOrAmmoType = "N/A";
        weapon4.rangeMeters = 1.5;
        weapon4.price = 80.00;

        System.out.println("Weapon ID: " + weapon4.weaponId);
        System.out.println("Type: " + weapon4.type);
        System.out.println("Material: " + weapon4.material);
        System.out.println("Weight: " + weapon4.weightKg + " kg");
        System.out.println("Caliber/Ammo: " + weapon4.caliberOrAmmoType);
        System.out.println("Range: " + weapon4.rangeMeters + " meters");
        System.out.println("Price: $" + weapon4.price);
        System.out.println();

        Weapon weapon5 = new Weapon();
        weapon5.weaponId = 5;
        weapon5.type = "Rifle";
        weapon5.material = "Steel/Wood";
        weapon5.weightKg = 3.5;
        weapon5.caliberOrAmmoType = ".308";
        weapon5.rangeMeters = 500.0;
        weapon5.price = 1200.00;

        System.out.println("Weapon ID: " + weapon5.weaponId);
        System.out.println("Type: " + weapon5.type);
        System.out.println("Material: " + weapon5.material);
        System.out.println("Weight: " + weapon5.weightKg + " kg");
        System.out.println("Caliber/Ammo: " + weapon5.caliberOrAmmoType);
        System.out.println("Range: " + weapon5.rangeMeters + " meters");
        System.out.println("Price: $" + weapon5.price);
        System.out.println();

        Weapon weapon6 = new Weapon();
        weapon6.weaponId = 6;
        weapon6.type = "Dagger";
        weapon6.material = "Steel";
        weapon6.weightKg = 0.3;
        weapon6.caliberOrAmmoType = "N/A";
        weapon6.rangeMeters = 1.0;
        weapon6.price = 45.00;

        System.out.println("Weapon ID: " + weapon6.weaponId);
        System.out.println("Type: " + weapon6.type);
        System.out.println("Material: " + weapon6.material);
        System.out.println("Weight: " + weapon6.weightKg + " kg");
        System.out.println("Caliber/Ammo: " + weapon6.caliberOrAmmoType);
        System.out.println("Range: " + weapon6.rangeMeters + " meters");
        System.out.println("Price: $" + weapon6.price);
        System.out.println();

        Weapon weapon7 = new Weapon();
        weapon7.weaponId = 7;
        weapon7.type = "Shotgun";
        weapon7.material = "Steel/Polymer";
        weapon7.weightKg = 3.0;
        weapon7.caliberOrAmmoType = "12 Gauge";
        weapon7.rangeMeters = 30.0;
        weapon7.price = 700.00;

        System.out.println("Weapon ID: " + weapon7.weaponId);
        System.out.println("Type: " + weapon7.type);
        System.out.println("Material: " + weapon7.material);
        System.out.println("Weight: " + weapon7.weightKg + " kg");
        System.out.println("Caliber/Ammo: " + weapon7.caliberOrAmmoType);
        System.out.println("Range: " + weapon7.rangeMeters + " meters");
        System.out.println("Price: $" + weapon7.price);
        System.out.println();

        Weapon weapon8 = new Weapon();
        weapon8.weaponId = 8;
        weapon8.type = "Crossbow";
        weapon8.material = "Aluminum/Wood";
        weapon8.weightKg = 2.5;
        weapon8.caliberOrAmmoType = "Bolt";
        weapon8.rangeMeters = 80.0;
        weapon8.price = 350.00;

        System.out.println("Weapon ID: " + weapon8.weaponId);
        System.out.println("Type: " + weapon8.type);
        System.out.println("Material: " + weapon8.material);
        System.out.println("Weight: " + weapon8.weightKg + " kg");
        System.out.println("Caliber/Ammo: " + weapon8.caliberOrAmmoType);
        System.out.println("Range: " + weapon8.rangeMeters + " meters");
        System.out.println("Price: $" + weapon8.price);
        System.out.println();

        Weapon weapon9 = new Weapon();
        weapon9.weaponId = 9;
        weapon9.type = "Spear";
        weapon9.material = "Wood/Steel";
        weapon9.weightKg = 2.2;
        weapon9.caliberOrAmmoType = "N/A";
        weapon9.rangeMeters = 3.0;
        weapon9.price = 90.00;

        System.out.println("Weapon ID: " + weapon9.weaponId);
        System.out.println("Type: " + weapon9.type);
        System.out.println("Material: " + weapon9.material);
        System.out.println("Weight: " + weapon9.weightKg + " kg");
        System.out.println("Caliber/Ammo: " + weapon9.caliberOrAmmoType);
        System.out.println("Range: " + weapon9.rangeMeters + " meters");
        System.out.println("Price: $" + weapon9.price);
        System.out.println();

        Weapon weapon10 = new Weapon();
        weapon10.weaponId = 10;
        weapon10.type = "Revolver";
        weapon10.material = "Steel";
        weapon10.weightKg = 1.1;
        weapon10.caliberOrAmmoType = ".357 Magnum";
        weapon10.rangeMeters = 35.0;
        weapon10.price = 600.00;

        System.out.println("Weapon ID: " + weapon10.weaponId);
        System.out.println("Type: " + weapon10.type);
        System.out.println("Material: " + weapon10.material);
        System.out.println("Weight: " + weapon10.weightKg + " kg");
        System.out.println("Caliber/Ammo: " + weapon10.caliberOrAmmoType);
        System.out.println("Range: " + weapon10.rangeMeters + " meters");
        System.out.println("Price: $" + weapon10.price);
        System.out.println();

        Weapon weapon11 = new Weapon();
        weapon11.weaponId = 11;
        weapon11.type = "Katana";
        weapon11.material = "Folded Steel";
        weapon11.weightKg = 1.2;
        weapon11.caliberOrAmmoType = "N/A";
        weapon11.rangeMeters = 1.8;
        weapon11.price = 400.00;

        System.out.println("Weapon ID: " + weapon11.weaponId);
        System.out.println("Type: " + weapon11.type);
        System.out.println("Material: " + weapon11.material);
        System.out.println("Weight: " + weapon11.weightKg + " kg");
        System.out.println("Caliber/Ammo: " + weapon11.caliberOrAmmoType);
        System.out.println("Range: " + weapon11.rangeMeters + " meters");
        System.out.println("Price: $" + weapon11.price);
        System.out.println();

        Weapon weapon12 = new Weapon();
        weapon12.type = "Slingshot";
        weapon12.material = "Wood/Rubber";
        weapon12.weightKg = 0.2;
        weapon12.caliberOrAmmoType = "Small stones/pellets";
        weapon12.rangeMeters = 10.0;
        weapon12.price = 15.00;

        System.out.println("Weapon ID: " + weapon12.weaponId);
        System.out.println("Type: " + weapon12.type);
        System.out.println("Material: " + weapon12.material);
        System.out.println("Weight: " + weapon12.weightKg + " kg");
        System.out.println("Caliber/Ammo: " + weapon12.caliberOrAmmoType);
        System.out.println("Range: " + weapon12.rangeMeters + " meters");
        System.out.println("Price: $" + weapon12.price);
        System.out.println();

        Weapon weapon13 = new Weapon();
        weapon13.weaponId = 13;
        weapon13.type = "Club";
        weapon13.material = "Wood";
        weapon13.weightKg = 2.5;
        weapon13.caliberOrAmmoType = "N/A";
        weapon13.rangeMeters = 1.0;
        weapon13.price = 30.00;

        System.out.println("Weapon ID: " + weapon13.weaponId);
        System.out.println("Type: " + weapon13.type);
        System.out.println("Material: " + weapon13.material);
        System.out.println("Weight: " + weapon13.weightKg + " kg");
        System.out.println("Caliber/Ammo: " + weapon13.caliberOrAmmoType);
        System.out.println("Range: " + weapon13.rangeMeters + " meters");
        System.out.println("Price: $" + weapon13.price);
        System.out.println();

        Weapon weapon14 = new Weapon();
        weapon14.weaponId = 14;
        weapon14.type = "Submachine Gun";
        weapon14.material = "Steel/Polymer";
        weapon14.weightKg = 2.8;
        weapon14.caliberOrAmmoType = ".45 ACP";
        weapon14.rangeMeters = 100.0;
        weapon14.price = 900.00;

        System.out.println("Weapon ID: " + weapon14.weaponId);
        System.out.println("Type: " + weapon14.type);
        System.out.println("Material: " + weapon14.material);
        System.out.println("Weight: " + weapon14.weightKg + " kg");
        System.out.println("Caliber/Ammo: " + weapon14.caliberOrAmmoType);
        System.out.println("Range: " + weapon14.rangeMeters + " meters");
        System.out.println("Price: $" + weapon14.price);
        System.out.println();

        Weapon weapon15 = new Weapon();
        weapon15.weaponId = 15;
        weapon15.type = "Grenade Launcher";
        weapon15.material = "Aluminum";
        weapon15.weightKg = 5.0;
        weapon15.caliberOrAmmoType = "40mm Grenade";
        weapon15.rangeMeters = 400.0;
        weapon15.price = 2500.00;

        System.out.println("Weapon ID: " + weapon15.weaponId);
        System.out.println("Type: " + weapon15.type);
        System.out.println("Material: " + weapon15.material);
        System.out.println("Weight: " + weapon15.weightKg + " kg");
        System.out.println("Caliber/Ammo: " + weapon15.caliberOrAmmoType);
        System.out.println("Range: " + weapon15.rangeMeters + " meters");
        System.out.println("Price: $" + weapon15.price);
        System.out.println();

        System.out.println("Main Ended - Weapon Collection Display Complete");
    }
}