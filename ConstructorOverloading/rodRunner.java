public class RodRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Rod Data");

        Rod rod1 = new Rod("Steel");
        rod1.getRodInfo();

        Rod rod2 = new Rod(6.0, 2.5);
        rod2.getRodInfo();

        Rod rod3 = new Rod("StrongSteel", 450.50);
        rod3.getRodInfo();

        Rod rod4 = new Rod(true, "Pune", "Construction");
        rod4.getRodInfo();

        System.out.println("Main Ended - Rod Data");
    }
}
