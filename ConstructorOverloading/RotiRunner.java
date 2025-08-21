public class RotiRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Roti Data");

        Roti r1 = new Roti("Tandoori Roti");
        r1.getRotiInfo();

        Roti r2 = new Roti("Flatbread", "Wheat Flour");
        r2.getRotiInfo();

        Roti r3 = new Roti(15.0, 50.0);
        r3.getRotiInfo();

        Roti r4 = new Roti(10.0, false, "Punjab");
        r4.getRotiInfo();

        System.out.println("Main Ended - Roti Data");
    }
}
