public class InvitationCardRunner {
    public static void main(String[] args) {
        System.out.println("Main Started - Invitation Card Data");

        InvitationCard card1 = new InvitationCard("Wedding Ceremony");
        card1.getCardInfo();

        InvitationCard card2 = new InvitationCard("Mr. & Mrs. Sharma", "Royal Gold Theme");
        card2.getCardInfo();

        InvitationCard card3 = new InvitationCard(2500.00, 100);
        card3.getCardInfo();

        InvitationCard card4 = new InvitationCard("Textured Glossy", true, "Hyderabad");
        card4.getCardInfo();

        System.out.println("Main Ended - Invitation Card Data");
    }
}
