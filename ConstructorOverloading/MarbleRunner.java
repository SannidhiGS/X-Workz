public class MarbleRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Marble Data");

        Marble marble1 = new Marble("Carrara");
        marble1.getMarbleInfo();

        Marble marble2 = new Marble("White", "Italy");
        marble2.getMarbleInfo();

        Marble marble3 = new Marble(2500.50, 2.5);
        marble3.getMarbleInfo();

        Marble marble4 = new Marble(true, "Veined", "Marble Suppliers Inc.");
        marble4.getMarbleInfo();

        System.out.println("Main Ended - Marble Data");
    }
}
