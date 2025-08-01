class EcommerceRunner {

    public static void main(String[] args) {

        Product product = new Product("Wireless Mouse", 799.00);

        Category category = new Category("Electronics", 120, product);

        Ecommerce ecommerce = new Ecommerce(2025, "ShopEasy", 10, category);

        ecommerce.getEcommerceDetails();
    }
}