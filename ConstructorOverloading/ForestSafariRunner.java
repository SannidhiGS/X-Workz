public class ForestSafariRunner {
    public static void main(String[] args) {
        Forest forest1 = new Forest();
        forest1.displayInfo();

        Forest forest2 = new Forest("Amazon");
        forest2.displayInfo();

        Forest forest3 = new Forest("Black Forest", 500);
        forest3.displayInfo();

        Forest forest4 = new Forest("Sherwood", 300, false);
        forest4.displayInfo();
    }
}
