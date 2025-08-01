class Category {

    String categoryName;
    int productCount;

    Product product;

    Category(String categoryName, int productCount, Product product) {
        this.categoryName = categoryName;
        this.productCount = productCount;
        this.product = product;
    }

    public void getCategoryDetails() {
        System.out.println("Category Name: " + categoryName);
        System.out.println("Product Count: " + productCount);
        this.product.getProductDetails();
    }
}