class InvitationCardRunner {
    public static void main(String args[]) {
        System.out.println("Main Started - Invitation Card Collection Display");
		
		
        InvitationCard card1 = new InvitationCard(1,"Birthday Party","Alice Smith","August 15, 2025","3:00 PM", "Park Lane","The Johnsons","johnsons@email.com");
        /*card1.cardId = 1;
        card1.eventType = "Birthday Party";
        card1.recipientName = "Alice Smith";
        card1.eventDate = "August 15, 2025";
        card1.eventTime = "3:00 PM";
        card1.eventLocation = "Community Hall, Park Lane";
        card1.senderName = "The Johnsons";
        card1.rsvpContact = "johnsons@email.com";*/
		card1.getInvInfo();
		

        

        InvitationCard card2=new InvitationCard(2,"Birthday Party","Alice Smith","August 15, 2025","3:00 PM", "Park Lane","The Johnsons","johnsons@email.com");
		card2.getInvInfo();
		
        InvitationCard card3 = new InvitationCard(3,"Graduation Celebration","Family & Friends","June 10, 2025","6:00 PM", "My Home, 123 Maple Street","Emily Chen", "emily.grad@email.com");
       

                card3.getInvInfo();

        InvitationCard card4 = new InvitationCard( 4,
         "Baby Shower", "Jessica Lee", "July 5, 2025", "1:00 PM", "The Garden Cafe","Sarah & Tom","sarah.baby@email.com");
        card4.getInvInfo();

        InvitationCard card5 = new InvitationCard( 5,"Housewarming Party", "Neighbors & Friends","October 1, 2025","7:00 PM", "New Home, 456 Oak Ave","The Millers", "millers.housewarming@email.com");
        card5.getInvInfo();
			   
        InvitationCard card6 = new InvitationCard( 6, "Retirement Party", "Colleagues & Family", "November 20, 2025"  ,"5:00 PM", "The Executive Club","Company HR", "hr@company.com");
        card6.getInvInfo();

        InvitationCard card7 = new InvitationCard(7,
   "Engagement Party",
        "Close Friends",
        "April 30, 2025",
       "7:30 PM",
         "The Grand View Restaurant",
       "Liam & Olivia",
       "liam.olivia.rsvp@email.com");
        

                card7.getInvInfo();

        InvitationCard card8 = new InvitationCard( 8,
         "Anniversary Dinner",
        "Dear Family",
        "December 1, 2025",
         "7:00 PM",
        "Our Home",
         "John & Mary",
        "johnmary.anniversary@email.com");
        

                card8.getInvInfo();

        InvitationCard card9 = new InvitationCard(9,"Holiday Gathering",
        "Friends & Family",
        "December 24, 2025",
         "6:00 PM",
         "The Winter Lodge",
        "The Andersons",
         "holiday@andersons.com");
        card9.getInvInfo();

        InvitationCard card10 = new InvitationCard( 10,"Dinner Party","Close Circle", "March 10, 2026","8:00 PM","Chef's Table Bistro", "S,phia Lee","sophia.dinner@email.com");
        card10.getInvInfo();

        InvitationCard card11 = new InvitationCard( 11, "Charity Gala","Esteemed Guests", "January 25, 2026","7:00 PM","The Grand Convention Center", "Helping Hands Foundation","gala@helpinghands.org");
        card11.getInvInfo();

        InvitationCard card12 = new InvitationCard( 12,"Art Exhibition Opening", "Art Enthusiasts","February 14, 2026","6:00 PM","Modern Art Gallery","City Art Collective", "artshow@gallery.com");
        card12.getInvInfo();

        InvitationCard card13 = new InvitationCard(13, "Sporting Event Watch Party", "Fellow Fans","April 1, 2026", "2:00 PM" ,"Sports Bar Downtown", "The Fan Club","fans@sports.com");
        card13.getInvInfo();

        InvitationCard card14 = new InvitationCard(14,"Costume Party", "Spooky Friends","October 31, 2025","8:00 PM", "Haunted Mansion","Dracula & Frankenstein","monsters@party.com");
         card14.getInvInfo();

        InvitationCard card16 = new InvitationCard(16,"Farewell Gathering", "Team Members", "May 5, 2026", "4:00 PM" ,"Office Breakroom", "The Management","hr.farewell@company.org");
		card16.getInvInfo();
		
		InvitationCard card17 = new InvitationCard(17,"Farewell Gathering", "Team Members", "May 5, 2026", "4:00 PM" ,"Office Breakroom", "The Management","hr.farewell@company.org");
		card17.getInvInfo();
		
		InvitationCard card18 = new InvitationCard(18,"Farewell Gathering", "Team Members", "May 5, 2026", "4:00 PM" ,"Office Breakroom", "The Management","hr.farewell@company.org");
		card18.getInvInfo();
		
		InvitationCard card19 = new InvitationCard(19,"Farewell Gathering", "Team Members", "May 5, 2026", "4:00 PM" ,"Office Breakroom", "The Management","hr.farewell@company.org");
		card19.getInvInfo();
		
		InvitationCard card20 = new InvitationCard(20,"Farewell Gathering", "Team Members", "May 5, 2026", "4:00 PM" ,"Office Breakroom", "The Management","hr.farewell@company.org");
		card20.getInvInfo();

        System.out.println("Main Ended - Invitation Card Collection Display Complete");
    }
}