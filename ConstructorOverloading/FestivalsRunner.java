public class FestivalsRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Festivals Data");

        Festival festival1 = new Festival("Onam");
        Festival festival2 = new Festival("India", "Hindu");
        Festival festival3 = new Festival("Onam", "Monsoon", "Vamana");
        Festival festival4 = new Festival(true);

        System.out.println();

        festival1.getFestivalInfo();
        festival2.getFestivalInfo();
        festival3.getFestivalInfo();
        festival4.getFestivalInfo();

        System.out.println("Main Ended - Festivals Data Display Complete");
    }
}
