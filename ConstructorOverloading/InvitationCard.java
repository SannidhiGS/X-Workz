public class InvitationCard {
    String eventName;
    String hostName;
    String theme;
    double cost;
    int quantity;
    String paperType;
    boolean isPersonalized;
    String printingLocation;

    InvitationCard() {
    }

    InvitationCard(String eventName) {
        this.eventName = eventName;
    }

    InvitationCard(String hostName, String theme) {
        this.hostName = hostName;
        this.theme = theme;
    }

    InvitationCard(double cost, int quantity) {
        this.cost = cost;
        this.quantity = quantity;
    }

    InvitationCard(String paperType, boolean isPersonalized, String printingLocation) {
        this.paperType = paperType;
        this.isPersonalized = isPersonalized;
        this.printingLocation = printingLocation;
    }

    void getCardInfo() {
        System.out.println("Event Name: " + eventName);
        System.out.println("Host Name: " + hostName);
        System.out.println("Theme: " + theme);
        System.out.println("Cost: ₹" + cost);
        System.out.println("Quantity: " + quantity);
        System.out.println("Paper Type: " + paperType);
        System.out.println("Personalized: " + isPersonalized);
        System.out.println("Printing Location: " + printingLocation);
        System.out.println();
    }
}
