class PlayStore {
       static String whatsApp = "WhatsApp";
        static String instagram = "Instagram";
        static String facebook = "Facebook";
        static String snapchat = "Snapchat";
		static String spotify = "Spotify";
		static String youTube = "YouTube";
		static String googleMaps = "GoogleMaps";
		static String zomato = "Zomato";
		static String swiggy = "Swiggy";
		static String amazon = "Amazon";

		static String appNames[] = {whatsApp, instagram, facebook, snapchat, spotify, youTube, googleMaps, zomato, swiggy, amazon};
public static void main(String args[]) {
        System.out.println("The number of apps: " + appNames.length);
        //System.out.println(appNames[0]+ " "+appNames[1]+" "+appNames[2]+" "+appNames[3]+" "+appNames[4]+" "+appNames[5]+" "+appNames[6]+" "+appNames[7]+" "+appNames[8]+" "+appNames[9]);
		for(String appName:appNames){
			System.out.println(appName);
		}
	}
}
