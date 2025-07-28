class InvitationCardRunner {
    public static void main(String[] args) {

        InvitationCard c1 = new InvitationCard("Wedding Bells","Golden","Wedding","A5",20.0,true);
       
        c1.getInvitationCardInfo();

        InvitationCard c2 = new InvitationCard("Birthday Bash","Blue","Birthday","A4",10.0,false);
        
        c2.getInvitationCardInfo();

        InvitationCard c3 = new InvitationCard("Baby Shower","Pink","Baby Shower","A6",20.0,true);
       
        c3.getInvitationCardInfo();

        InvitationCard c4 = new InvitationCard("Housewarming","Beige","Housewarming","A5",25.0,true);
        
        c4.getInvitationCardInfo();

        InvitationCard c5 = new InvitationCard("Anniversary Party","Golden","Wedding","A5",20.0,true);
        
        c5.getInvitationCardInfo();

        InvitationCard c6 = new InvitationCard("Engagement","Golden","Wedding","A5",20.0,true);
       
        c6.getInvitationCardInfo();

        InvitationCard c7 = new InvitationCard("Birthday Bash","Blue","Birthday","A4",10.0,false);
        
        c7.getInvitationCardInfo();

        InvitationCard c8 = new InvitationCard("Baby Shower","Pink","Baby Shower","A6",20.0,true);
        
        c8.getInvitationCardInfo();

        InvitationCard c9 = new InvitationCard();
        c9.title = "Reception Invite";
        c9.color = "Cream";
        c9.occasion = "Reception";
        c9.size = "A4";
        c9.price = 27.0;
        c9.isPrinted = false;
        c9.getInvitationCardInfo();

        InvitationCard c10 = new InvitationCard();
        c10.title = "Naming Ceremony";
        c10.color = "Light Blue";
        c10.occasion = "Naming";
        c10.size = "A6";
        c10.price = 17.0;
        c10.isPrinted = true;
        c10.getInvitationCardInfo();

        InvitationCard c11 = new InvitationCard();
        c11.title = "Sangeet Night";
        c11.color = "Yellow";
        c11.occasion = "Sangeet";
        c11.size = "A5";
        c11.price = 20.0;
        c11.isPrinted = true;
        c11.getInvitationCardInfo();

        InvitationCard c12 = new InvitationCard();
        c12.title = "Farewell Party";
        c12.color = "Navy Blue";
        c12.occasion = "Farewell";
        c12.size = "A4";
        c12.price = 24.0;
        c12.isPrinted = true;
        c12.getInvitationCardInfo();

        InvitationCard c13 = new InvitationCard();
        c13.title = "Reunion Party";
        c13.color = "Teal";
        c13.occasion = "Reunion";
        c13.size = "A5";
        c13.price = 20.5;
        c13.isPrinted = false;
        c13.getInvitationCardInfo();

        InvitationCard c14 = new InvitationCard();
        c14.title = "Welcome Party";
        c14.color = "White";
        c14.occasion = "Welcome";
        c14.size = "A4";
        c14.price = 18.5;
        c14.isPrinted = true;
        c14.getInvitationCardInfo();

        InvitationCard c15 = new InvitationCard();
        c15.title = "Office Opening";
        c15.color = "Brown";
        c15.occasion = "Business";
        c15.size = "A5";
        c15.price = 23.0;
        c15.isPrinted = false;
        c15.getInvitationCardInfo();

        InvitationCard c16 = new InvitationCard();
        c16.title = "Annual Day";
        c16.color = "Orange";
        c16.occasion = "School Function";
        c16.size = "A6";
        c16.price = 16.0;
        c16.isPrinted = true;
        c16.getInvitationCardInfo();

        InvitationCard c17 = new InvitationCard();
        c17.title = "Sports Day";
        c17.color = "Sky Blue";
        c17.occasion = "School Event";
        c17.size = "A5";
        c17.price = 19.0;
        c17.isPrinted = true;
        c17.getInvitationCardInfo();

        InvitationCard c18 = new InvitationCard();
        c18.title = "Book Launch";
        c18.color = "Black";
        c18.occasion = "Literary";
        c18.size = "A5";
        c18.price = 25.5;
        c18.isPrinted = true;
        c18.getInvitationCardInfo();

        InvitationCard c19 = new InvitationCard();
        c19.title = "Art Exhibition";
        c19.color = "Multicolor";
        c19.occasion = "Art";
        c19.size = "A4";
        c19.price = 30.0;
        c19.isPrinted = false;
        c19.getInvitationCardInfo();

        InvitationCard c20 = new InvitationCard();
        c20.title = "Cultural Night";
        c20.color = "Purple";
        c20.occasion = "Cultural";
        c20.size = "A5";
        c20.price = 22.5;
        c20.isPrinted = true;
        c20.getInvitationCardInfo();
    }
}
