class Buyer {
	static String name="Sunil Mehta";
	static String agency="Premium Reality";
    public static void details(String name, String email,long phone) {
        System.out.println("Buyer Name: " +name);
        System.out.println("Email: " +email);
        System.out.println("Contact Number: " +phone);
        Agents.asi(name,agency);
    }
}
