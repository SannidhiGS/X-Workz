public class HatRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Hat Data");

        Hat hat1 = new Hat("Beach Sun Hat");
        hat1.getHatInfo();

        Hat hat2 = new Hat("Fedora", "H&M");
        hat2.getHatInfo();

        Hat hat3 = new Hat(799.99, 58);
        hat3.getHatInfo();

        Hat hat4 = new Hat("Cotton", true, "Bangalore");
        hat4.getHatInfo();

        System.out.println("Main Ended - Hat Data");
    }
}
