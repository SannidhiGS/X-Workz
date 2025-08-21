public class KarateSuitRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Karate Suit Data");

        KarateSuit suit1 = new KarateSuit("Traditional Gi");
        suit1.getSuitInfo();

        KarateSuit suit2 = new KarateSuit("Medium", "Adidas");
        suit2.getSuitInfo();

        KarateSuit suit3 = new KarateSuit(1999.99, 2);
        suit3.getSuitInfo();

        KarateSuit suit4 = new KarateSuit("Cotton Blend", true, "Mumbai");
        suit4.getSuitInfo();

        System.out.println("Main Ended - Karate Suit Data");
    }
}
