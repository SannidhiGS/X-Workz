public class ZeptoRunner {
    public static void main(String[] args) {
		String fruit="Apple";
        String price=Zepto.order(fruit);
        System.out.println("Price: " + price);

        System.out.println("Fruit: " + fruit);
    }
}
