class MagazineRunner {
    public static void main(String[] args) {
        Article article = new Article("AI in 2025", "Dr. Kumar", "The future of AI is dynamic and evolving rapidly.");
        Page page = new Page(12, "Technology", article);
        Magazine magazine = new Magazine("Tech Today", "Future Media", page);
        magazine.getMagazineDetails();
    }
}