import java.time.LocalDate;

class CourtCaseRunner {
    public static void main(String[] args) {

        System.out.println("Main Started - Court Case Information Display");

        CourtCase c1 = new CourtCase("OS/123/2023", "Civil - Property Dispute");
		c1.getCourtCaseInfo();
        CourtCase c2 = new CourtCase("Family Court", "Bengaluru","Magistrate Court");
		c2.getCourtCaseInfo();
        CourtCase c3 = new CourtCase("LocalDate.of(2022, 11, 1)", "LocalDate.of(2025, 8, 12)");
		c3.getCourtCaseInfo();
        CourtCase c4 = new CourtCase("Notices issued","replies awaited", 1);
		c4.getCourtCaseInfo();	
        System.out.println("Main Ended - Court Case Information Display Complete");
    }
}
