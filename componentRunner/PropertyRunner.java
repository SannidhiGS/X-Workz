public class PropertyRunner{
	static String propType = "Apartment";
    static String location = "Indiranagar";
    static double price = 8500000;

    public static void main(String[] args) {
        Property.buy(propType,location,price);
    }
}
