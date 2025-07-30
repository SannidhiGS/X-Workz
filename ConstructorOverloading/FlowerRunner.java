public class FlowerRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Flower Data");

        Flower flower1 = new Flower("Rose");
        Flower flower2 = new Flower("Red", true);
        Flower flower3 = new Flower("Lotus", "Summer", 30);
        Flower flower4 = new Flower("India", 0);  // 0 is a dummy value to match constructor

        System.out.println();

        flower1.getFlowerInfo();
        flower2.getFlowerInfo();
        flower3.getFlowerInfo();
        flower4.getFlowerInfo();

        System.out.println("Main Ended - Flower Data Display Complete");
    }
}
