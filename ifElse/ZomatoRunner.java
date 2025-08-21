public class ZomatoRunner {
    public static void main(String[] args) {
		String dish="Gulab Jamun";
        int price=Zomato.order(dish);
        System.out.println("Sweet: " + dish +" Price: "+price);
}
}