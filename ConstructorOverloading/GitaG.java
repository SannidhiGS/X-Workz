public class GiTag {
    private String product;
    private String state;
    private int year;

    public GiTag() {
        this.product = "Unknown";
        this.state = "Unknown";
        this.year = 0;
    }

    public GiTag(String product) {
        this.product = product;
        this.state = "Unknown";
        this.year = 0;
    }

    public GiTag(String product, String state) {
        this.product = product;
        this.state = state;
        this.year = 0;
    }

    public GiTag(String product, String state, int year) {
        this.product = product;
        this.state = state;
        this.year = year;
    }

    public void display() {
        System.out.println("Product: " + product);
        System.out.println("State: " + state);
        System.out.println("Year: " + year);
        System.out.println();
    }
}
