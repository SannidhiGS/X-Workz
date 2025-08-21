public class SwiggyRunner {
    public static void main(String[] args) {
        /*Swiggy.order("Masala Dosa");
        Swiggy.order("Paneer Butter Masala");
        Swiggy.order("Fish Curry");
        Swiggy.order("Pizza");
        Swiggy.order("Chocolate Shake"); */
		String dish="Sandwich";
		int price=Swiggy.order(dish);
		System.out.println("Dish: " + dish +"Price: "+price);
		
    }
}
