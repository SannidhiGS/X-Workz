public class WeaponRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Weapon Data");

        Weapon w1 = new Weapon("Excalibur");
        w1.getWeaponInfo();

        Weapon w2 = new Weapon("Sword", "Valyrian Steel Co.");
        w2.getWeaponInfo();

        Weapon w3 = new Weapon(3.5, 100.0);
        w3.getWeaponInfo();

        Weapon w4 = new Weapon(150000.00, false, "England");
        w4.getWeaponInfo();

        System.out.println("Main Ended - Weapon Data");
    }
}
