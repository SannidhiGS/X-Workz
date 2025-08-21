class WhatsApp {

    static String phoneNumber;
    static String displayName;

    public static boolean registerUser(String phone, String name) {
        boolean isUserRegistered = false;
        boolean phoneValid = false;
        boolean nameValid = false;

        if (phone != null) {
            phoneNumber = phone;
            phoneValid = true;
        }

        if (name != null) {
            displayName = name;
            nameValid = true;
        }

        if (phoneValid && nameValid) {
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Display Name: " + displayName);
    }
}
