<<<<<<< HEAD
class PurpleApp{
    static String mobileNumber;
    static String fullName;
    public static boolean registerUser(String mobile, String name) {
        boolean isUserRegistered = false;
		boolean mobileValid = false;
        boolean nameValid = false;
		
        if (mobile != null) {
            mobileNumber = mobile;
            mobileValid = true;
        }
		
        if(name != null){
            fullName = name;
            nameValid = true;
        }
	
        if(mobileValid && nameValid){
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Full Name: " + fullName);
    }
}
=======
class PurpleApp{
    static String mobileNumber;
    static String fullName;
    public static boolean registerUser(String mobile, String name) {
        boolean isUserRegistered = false;
		boolean mobileValid = false;
        boolean nameValid = false;
		
        if (mobile != null) {
            mobileNumber = mobile;
            mobileValid = true;
        }
		
        if(name != null){
            fullName = name;
            nameValid = true;
        }
	
        if(mobileValid && nameValid){
            isUserRegistered = true;
        }

        return isUserRegistered;
    }

    public static void getUserInfo() {
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Full Name: " + fullName);
    }
}
>>>>>>> 156df8cb25e8b9f307b32dad0baab50f4f23e083
