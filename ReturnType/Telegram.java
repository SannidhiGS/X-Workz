class Telegram {
	static String uName;
	static String eml;
	static String psd;
	static String cpsd;
	static String phno;

	public static boolean userRegistered(String userName,String email,String password,String conPassword,String phone){
		boolean isUsername=false;
		boolean isEmailR=false;
		boolean isPasswdR=false;
		boolean isCpasswordR=false;
		boolean isPhoneR=false;
		boolean isUserRegistered=false;

		if(userName!=null){
			uName=userName;
			isUsername=true;
		}
		else{
			System.out.println("The user not registered");
		}
		if(email!=null){
			eml=email;
			isEmailR=true;
		}
		else{
			System.out.println("The email not registered");
		}
		if(password!=null){
			psd=password;
			isPasswdR=true;
		}
		else{
			System.out.println("wrong password");
		}
		if(conPassword!=null && psd==conPassword){
			cpsd=conPassword;
			isCpasswordR=true;
		}
		else{
			System.out.println("Wrong password");
		}
		if(phone != null && phone.length()==10){
			phno=phone;
			isPhoneR=true;
		}
		else{
			System.out.println("The phone is not registered");
		}
		if(isUsername && isEmailR && isPasswdR && isCpasswordR && isPhoneR){
			isUserRegistered=true;
		}
		else{
			System.out.println("The user not registered");
		}
		return isUserRegistered;
	}
	public static void userDet(){
		System.out.println("User Name: "+uName);
		System.out.println("Email: "+eml);
		System.out.println("Password: "+psd);
		System.out.println("Conform Password: "+cpsd);
		System.out.println("Phone: "+phno);
	}
}
class TelegramRunner {
	public static void main(String args[]){
		boolean isUserRegistered = Telegram.userRegistered("Sophia","sophia@telegram.com","telegram123","telegram123","9812345678");
		if(isUserRegistered){
			Telegram.userDet();
		}
	}
}
