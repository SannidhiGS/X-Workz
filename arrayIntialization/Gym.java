class Gym {

    static String memberName;
    static String membershipType;

    public static boolean registerUser(String name, String type) {
        boolean isUserRegistered = false;
        boolean nameValid = false;
        boolean typeValid = false;

        if (name != null) {
            memberName = name;
            nameValid = true;
        }

        if (type != null) {
            membershipType = type;
            typeValid = true;
        }

        if (nameValid && typeValid) {
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership Type: " + membershipType);
    }
}
