class Nyka {
    
     static String firstName;
    static String lastName;
    static String phoneNumber;
    static String dob;
    static String gender;
    static String password;


    public static boolean validateUserProfile(String firstName, String lastName, String phoneNumber, String dob, String gender, String password) {
        boolean userValid=false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isPhoneNumberValid = false;
        boolean isDobValid = false;
        boolean isGenderValid = false;
        boolean isPasswordValid = false;
        if (firstName != null ) {
			firstName =firstName;
            isFirstNameValid = true;
        } 

    
        if (lastName != null ) {
			lastName =lastName ;
            isLastNameValid = true;
        } 
        

        if (phoneNumber != null ) {
			phoneNumber=phoneNumber;
            isPhoneNumberValid = true;
        } 
        
        if (dob != null ) {
			dob=dob;
            isDobValid = true;
        } 
       
        if (gender != null ) {
			gender=gender;
            isGenderValid = true;
        } 
        

        if (password != null ) {
			password=password;
            isPasswordValid = true;
        } 

        if(  isFirstNameValid==true&&  isLastNameValid==true&&isPhoneNumberValid&&isDobValid==true&&isGenderValid== true&&isPasswordValid==true){
             userValid=true;
        }
        
  }
}