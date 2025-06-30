class VideoGames {
    static String gameTitle = "The Legend of Zelda: Breath of the Wild";
    static String developer = "Nintendo";
    static String publisher = "Nintendo";
    static String genre = "Action-adventure";
    static String platform = "Nintendo Switch";
    static String releaseDate = "2017-03-03";
    static double rating = 9.5;
    static int playersSupported = 1;
    static boolean hasMultiplayer = false;
    static boolean hasDLC = true;
    static String gameMode = "Single-player";
    static int gameLengthHours = 50;
    static String ESRBRating = "E10+";
    static boolean hasInGamePurchases = false;
    static String languageSupport = "Multiple";
    static boolean hasAchievements = true;
    static String gameEngine = "Havok";
    static int fileSizeGB = 14;
    static String storyline = "Explore a vast open world and save Hyrule.";
    static boolean isCrossPlatform = false;

    public static void main(String[] args) {
        System.out.println("Game Title: " + gameTitle);
        System.out.println("Developer: " + developer);
        System.out.println("Publisher: " + publisher);
        System.out.println("Genre: " + genre);
        System.out.println("Platform: " + platform);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Rating: " + rating);
        System.out.println("Players Supported: " + playersSupported);
        System.out.println("Has Multiplayer: " + hasMultiplayer);
        System.out.println("Has DLC: " + hasDLC);
        System.out.println("Game Mode: " + gameMode);
        System.out.println("Game Length (hours): " + gameLengthHours);
        System.out.println("ESRB Rating: " + ESRBRating);
        System.out.println("Has In-Game Purchases: " + hasInGamePurchases);
        System.out.println("Language Support: " + languageSupport);
        System.out.println("Has Achievements: " + hasAchievements);
        System.out.println("Game Engine: " + gameEngine);
        System.out.println("File Size (GB): " + fileSizeGB);
        System.out.println("Storyline: " + storyline);
        System.out.println("Is Cross Platform: " + isCrossPlatform);
    }
}
