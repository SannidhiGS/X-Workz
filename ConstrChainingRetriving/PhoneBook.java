class PhoneBook {
    String ownerName;
    int totalContacts;
    Contact contact;

    PhoneBook(String ownerName, int totalContacts, Contact contact) {
        this.ownerName = ownerName;
        this.totalContacts = totalContacts;
        this.contact = contact;
    }

    void getPhoneBookDetails() {
        System.out.println("PhoneBook Owner: " + ownerName);
        System.out.println("Total Contacts: " + totalContacts);
        contact.getContactDetails();
    }
}
