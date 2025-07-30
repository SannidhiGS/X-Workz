public class NewsPaperRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - NewsPaper Data");

        NewsPaper np1 = new NewsPaper("The Times");
        np1.getNewsPaperInfo();

        NewsPaper np2 = new NewsPaper("English", "Times Group");
        np2.getNewsPaperInfo();

        NewsPaper np3 = new NewsPaper(5.00, 24);
        np3.getNewsPaperInfo();

        NewsPaper np4 = new NewsPaper(true, "Mumbai", "Ravi Kumar");
        np4.getNewsPaperInfo();

        System.out.println("Main Ended - NewsPaper Data");
    }
}
