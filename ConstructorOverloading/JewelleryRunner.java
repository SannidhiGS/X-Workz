public class JewelleryRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Jewellery Data");

        Jewellery j1 = new Jewellery("Gold Necklace");
        j1.getJewelleryInfo();

        Jewellery j2 = new Jewellery("Ring", "Tanishq");
        j2.getJewelleryInfo();

        Jewellery j3 = new Jewellery(52000.00, 20);
        j3.getJewelleryInfo();

        Jewellery j4 = new Jewellery("22K Gold", true, "Chennai");
        j4.getJewelleryInfo();

        System.out.println("Main Ended - Jewellery Data");
    }
}
