public class GiTagRunner {
    public static void main(String[] args) {
        GiTag tag1 = new GiTag();
        tag1.display();

        GiTag tag2 = new GiTag("Darjeeling Tea");
        tag2.display();

        GiTag tag3 = new GiTag("Mysore Silk", "Karnataka");
        tag3.display();

        GiTag tag4 = new GiTag("Pashmina", "Jammu & Kashmir", 2008);
        tag4.display();
    }
}
