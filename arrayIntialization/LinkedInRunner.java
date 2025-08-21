class LinkedInRunner {

    public static void main(String[] args) {
        boolean userIsRegistered = LinkedIn.registerUser("jane.doe@linkedin.com", "Software Engineer");

        System.out.println("Is User Registered: " + userIsRegistered);

        LinkedIn.getUserInfo();
    }
}
