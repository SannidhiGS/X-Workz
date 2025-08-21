public class NewsPaper {
    String name;
    String language;
    String publisher;
    double price;
    int pages;
    boolean isDaily;
    String city;
    String editor;

    NewsPaper() {
    }

    NewsPaper(String name) {
        this.name = name;
    }

    NewsPaper(String language, String publisher) {
        this.language = language;
        this.publisher = publisher;
    }

    NewsPaper(double price, int pages) {
        this.price = price;
        this.pages = pages;
    }

    NewsPaper(boolean isDaily, String city, String editor) {
        this.isDaily = isDaily;
        this.city = city;
        this.editor = editor;
    }

    void getNewsPaperInfo() {
        System.out.println("Name: " + name);
        System.out.println("Language: " + language);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: ₹" + price);
