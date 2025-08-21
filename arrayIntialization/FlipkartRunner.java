class FlipkartRunner {

    public static void main(String[] args) {
        boolean userIsRegistered = Flipkart.registerUser("rahul@example.com", "Rahul123");

        System.out.println("Is User Registered: " + userIsRegistered);

        Flipkart.getUserInfo();
    }
}
