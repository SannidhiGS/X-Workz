class LinkedIn {

    static String email;
    static String jobTitle;

    public static boolean registerUser(String userEmail, String title) {
        boolean isUserRegistered = false;
        boolean emailValid = false;
        boolean titleValid = false;
        if (userEmail != null) {
            email = userEmail;
            emailValid = true;
        }
        if (title != null) {
            jobTitle = title;
            titleValid = true;
        }
        if (emailValid && titleValid) {
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("Email: " + email);
        System.out.println("Job Title: " + jobTitle);
    }
}
