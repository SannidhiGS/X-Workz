class Flipkart {

    static String email;
    static String userName;

    public static boolean registerUser(String userEmail, String name) {
        boolean isUserRegistered = false;
        boolean emailValid = false;
        boolean nameValid = false;

        if (userEmail != null) {
            email = userEmail;
            emailValid = true;
        }

        if (name != null) {
            userName = name;
            nameValid = true;
        }

        if (emailValid && nameValid) {
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("Email: " + email);
        System.out.println("Username: " + userName);
    }
}
