class Magazine {
    String name;
    String publisher;
    Page page;

    Magazine(String name, String publisher, Page page) {
        this.name = name;
        this.publisher = publisher;
        this.page = page;
    }

    void getMagazineDetails() {
        System.out.println("Magazine Name: " + name);
        System.out.println("Publisher: " + publisher);
        page.getPageDetails();
    }
}