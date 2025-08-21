class WhatsAppRunner {

    public static void main(String[] args) {
        boolean userIsRegistered = WhatsApp.registerUser("9876543210", "Rahul");

        System.out.println("Is User Registered: " + userIsRegistered);

        WhatsApp.getUserInfo();
    }
}
