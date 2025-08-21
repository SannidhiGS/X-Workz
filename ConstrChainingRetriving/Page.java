class Page {
    int pageNumber;
    String section;
    Article article;

    Page(int pageNumber, String section, Article article) {
        this.pageNumber = pageNumber;
        this.section = section;
        this.article = article;
    }

    void getPageDetails() {
        System.out.println("Page Number: " + pageNumber);
        System.out.println("Section: " + section);
        article.getArticleDetails();
    }
}