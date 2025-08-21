class MobileRunner {
    public static void main(String[] args) {
        Contact contact = new Contact("John Doe", "9876543210", "john.doe@example.com");
        PhoneBook phoneBook = new PhoneBook("John's PhoneBook", 1, contact);
        Mobile mobile = new Mobile("Samsung", "Galaxy S21", phoneBook);
        mobile.getMobileDetails();
    }
}