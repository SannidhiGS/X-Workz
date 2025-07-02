class SocialMedia {
    public static void main(String args[]) {
        static String facebook = "Facebook";
		static String instagram = "Instagram";
		static String twitter = "Twitter";
		static String linkedIn = "LinkedIn";
		static String snapchat = "Snapchat";
		static String youTube = "YouTube";
		static String pinterest = "Pinterest";
		static String reddit = "Reddit";
		static String mozz = "Mozz";
		static String telegram = "Telegram";

        static String mediaNames[] = {facebook, instagram, twitter, linkedIn, snapchat, youTube, pinterest, reddit, mozz, telegram};

        System.out.println("The number of social media platforms " + mediaNames.length);
        //System.out.println(mediaNames[0]+" "+mediaNames[1]+" "+mediaNames[2]+ " "+ mediaNames[3]+" "+ mediaNames[4]+" "+ mediaNames[5]+" "+ mediaNames[6]+ " " + mediaNames[7] +" " + mediaNames[8] + " "+mediaNames[9]);
			for(String mediaName:mediaNames){
				System.out.println(mediaName);
			}
	}
}