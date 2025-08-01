class Ecommerce {

    int ecommerceId;
    String platformName;
    int totalCategories;

    Category category;

    Ecommerce(int ecommerceId, String platformName, int totalCategories, Category category) {
        this.ecommerceId = ecommerceId;
        this.platformName = platformName;
        this.totalCategories = totalCategories;
        this.category = category;
    }

    public void getEcommerceDetails() {
        System.out.println("Ecommerce ID: " + ecommerceId);
        System.out.println("Platform Name: " + platformName);
        System.out.println("Total Categories: " + totalCategories);
        this.category.getCategoryDetails();
    }
}
