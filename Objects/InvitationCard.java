class InvitationCard {
    int cardId;
    String eventType;
    String recipientName;
    String eventDate;
    String eventTime;
    String eventLocation;
    String senderName;
    String rsvpContact;
	
	public void getInvInfo(){
		System.out.println("Card ID: " + cardId);
        System.out.println("Event Type: " + eventType);
        System.out.println("Recipient: " + recipientName);
        System.out.println("Date: " + eventDate);
        System.out.println("Time: " + eventTime);
        System.out.println("Location: " + eventLocation);
        System.out.println("Sender: " + senderName);
        System.out.println("RSVP: " + rsvpContact);
        System.out.println();
	}
}