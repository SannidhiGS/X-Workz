class Article {
    String title;
    String author;
    String content;

    Article(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    void getArticleDetails() {
        System.out.println("Article Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
    }
}