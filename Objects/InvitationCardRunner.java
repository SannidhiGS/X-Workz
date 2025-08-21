class InvitationCardRunner {
    public static void main(String args[]) {
        System.out.println("Main Started - Invitation Card Collection Display");
		
		InvitationCard(){
			System.out.println("The constructor invoked");
		}
        InvitationCard card1 = new InvitationCard();
        card1.cardId = 1;
        card1.eventType = "Birthday Party";
        card1.recipientName = "Alice Smith";
        card1.eventDate = "August 15, 2025";
        card1.eventTime = "3:00 PM";
        card1.eventLocation = "Community Hall, Park Lane";
        card1.senderName = "The Johnsons";
        card1.rsvpContact = "johnsons@email.com";

        card1.getInvInfo();

        InvitationCard card2 = new InvitationCard();
        card2.cardId = 2;
        card2.eventType = "Wedding Ceremony";
        card2.recipientName = "Mr. & Mrs. Davis";
        card2.eventDate = "September 22, 2025";
        card2.eventTime = "4:30 PM";
        card2.eventLocation = "Grand Ballroom, City Hotel";
        card2.senderName = "Sarah & Mark";
        card2.rsvpContact = "rsvp.sarahmark@wedding.com";

                card2.getInvInfo();

        InvitationCard card3 = new InvitationCard();
        card3.cardId = 3;
        card3.eventType = "Graduation Celebration";
        card3.recipientName = "Family & Friends";
        card3.eventDate = "June 10, 2025";
        card3.eventTime = "6:00 PM";
        card3.eventLocation = "My Home, 123 Maple Street";
        card3.senderName = "Emily Chen";
        card3.rsvpContact = "emily.grad@email.com";

                card3.getInvInfo();

        InvitationCard card4 = new InvitationCard();
        card4.cardId = 4;
        card4.eventType = "Baby Shower";
        card4.recipientName = "Jessica Lee";
        card4.eventDate = "July 5, 2025";
        card4.eventTime = "1:00 PM";
        card4.eventLocation = "The Garden Cafe";
        card4.senderName = "Sarah & Tom";
        card4.rsvpContact = "sarah.baby@email.com";

                card4.getInvInfo();

        InvitationCard card5 = new InvitationCard();
        card5.cardId = 5;
        card5.eventType = "Housewarming Party";
        card5.recipientName = "Neighbors & Friends";
        card5.eventDate = "October 1, 2025";
        card5.eventTime = "7:00 PM";
        card5.eventLocation = "New Home, 456 Oak Ave";
        card5.senderName = "The Millers";
        card5.rsvpContact = "millers.housewarming@email.com";

               card5.getInvInfo();
			   
        InvitationCard card6 = new InvitationCard();
        card6.cardId = 6;
        card6.eventType = "Retirement Party";
        card6.recipientName = "Colleagues & Family";
        card6.eventDate = "November 20, 2025";
        card6.eventTime = "5:00 PM";
        card6.eventLocation = "The Executive Club";
        card6.senderName = "Company HR";
        card6.rsvpContact = "hr@company.com";

                card6.getInvInfo();

        InvitationCard card7 = new InvitationCard();
        card7.cardId = 7;
        card7.eventType = "Engagement Party";
        card7.recipientName = "Close Friends";
        card7.eventDate = "April 30, 2025";
        card7.eventTime = "7:30 PM";
        card7.eventLocation = "The Grand View Restaurant";
        card7.senderName = "Liam & Olivia";
        card7.rsvpContact = "liam.olivia.rsvp@email.com";

                card7.getInvInfo();

        InvitationCard card8 = new InvitationCard();
        card8.cardId = 8;
        card8.eventType = "Anniversary Dinner";
        card8.recipientName = "Dear Family";
        card8.eventDate = "December 1, 2025";
        card8.eventTime = "7:00 PM";
        card8.eventLocation = "Our Home";
        card8.senderName = "John & Mary";
        card8.rsvpContact = "johnmary.anniversary@email.com";

                card8.getInvInfo();

        InvitationCard card9 = new InvitationCard();
        card9.cardId = 9;
        card9.eventType = "Holiday Gathering";
        card9.recipientName = "Friends & Family";
        card9.eventDate = "December 24, 2025";
        card9.eventTime = "6:00 PM";
        card9.eventLocation = "The Winter Lodge";
        card9.senderName = "The Andersons";
        card9.rsvpContact = "holiday@andersons.com";

              card9.getInvInfo();

        InvitationCard card10 = new InvitationCard();
        card10.cardId = 10;
        card10.eventType = "Dinner Party";
        card10.recipientName = "Close Circle";
        card10.eventDate = "March 10, 2026";
        card10.eventTime = "8:00 PM";
        card10.eventLocation = "Chef's Table Bistro";
        card10.senderName = "Sophia Lee";
        card10.rsvpContact = "sophia.dinner@email.com";

                card10.getInvInfo();

        InvitationCard card11 = new InvitationCard();
        card11.cardId = 11;
        card11.eventType = "Charity Gala";
        card11.recipientName = "Esteemed Guests";
        card11.eventDate = "January 25, 2026";
        card11.eventTime = "7:00 PM";
        card11.eventLocation = "The Grand Convention Center";
        card11.senderName = "Helping Hands Foundation";
        card11.rsvpContact = "gala@helpinghands.org";

                card11.getInvInfo();

        InvitationCard card12 = new InvitationCard();
        card12.cardId = 12;
        card12.eventType = "Art Exhibition Opening";
        card12.recipientName = "Art Enthusiasts";
        card12.eventDate = "February 14, 2026";
        card12.eventTime = "6:00 PM";
        card12.eventLocation = "Modern Art Gallery";
        card12.senderName = "City Art Collective";
        card12.rsvpContact = "artshow@gallery.com";

                card12.getInvInfo();

        InvitationCard card13 = new InvitationCard();
        card13.cardId = 13;
        card13.eventType = "Sporting Event Watch Party";
        card13.recipientName = "Fellow Fans";
        card13.eventDate = "April 1, 2026";
        card13.eventTime = "2:00 PM";
        card13.eventLocation = "Sports Bar Downtown";
        card13.senderName = "The Fan Club";
        card13.rsvpContact = "fans@sports.com";

                card13.getInvInfo();

        InvitationCard card14 = new InvitationCard();
        card14.cardId = 14;
        card14.eventType = "Costume Party";
        card14.recipientName = "Spooky Friends";
        card14.eventDate = "October 31, 2025";
        card14.eventTime = "8:00 PM";
        card14.eventLocation = "Haunted Mansion (My Place)";
        card14.senderName = "Dracula & Frankenstein";
        card14.rsvpContact = "monsters@party.com";

                card14.getInvInfo();

        InvitationCard card15 = new InvitationCard();
        card15.cardId = 15;
        card15.eventType = "Farewell Gathering";
        card15.recipientName = "Team Members";
        card15.eventDate = "May 5, 2026";
        card15.eventTime = "4:00 PM";
        card15.eventLocation = "Office Breakroom";
        card15.senderName = "The Management";
        card15.rsvpContact = "hr.farewell@company.org";

                card15.getInvInfo();

        System.out.println("Main Ended - Invitation Card Collection Display Complete");
    }
}