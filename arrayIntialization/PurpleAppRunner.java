class PurpleAppRunner{

    public static void main(String[] args) {
        boolean userIsRegistered = PurpleApp.registerUser("9876543210", "Priya Sharma");

        System.out.println("Is User Registered: " + userIsRegistered);

        PurpleApp.getUserInfo();
    }
}
