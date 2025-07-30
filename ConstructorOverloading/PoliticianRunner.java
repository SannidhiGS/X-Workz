public class PoliticianRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Politician Data");

        Politician p1 = new Politician("Rahul Verma");
        p1.getPoliticianInfo();

        Politician p2 = new Politician("National Party", "Mumbai Central");
        p2.getPoliticianInfo();

        Politician p3 = new Politician(54, 20);
        p3.getPoliticianInfo();

        Politician p4 = new Politician(true, "Masters in Political Science", "India");
        p4.getPoliticianInfo();

        System.out.println("Main Ended - Politician Data");
    }
}
