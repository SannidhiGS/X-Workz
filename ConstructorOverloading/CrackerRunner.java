class CrackerRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Cracker Data");

        Cracker c1 =new Cracker("Gold Sparklers (10cm)");
		c1.getCrackerInfo();
        Cracker c2 =new Cracker( "Flower Pot (Anar)", "Coronation Fireworks");
		c2.getCrackerInfo();
        Cracker c3 =new Cracker(480.00, 5, );
		c3.getCrackerInfo();
        Cracker c4 =new Cracker( 750.00, 1, "Green Cracker", false, "Sivakasi")
		c4.getCrackerInfo();
        

        System.out.println("Main Ended - Cracker Data");
    }
}
