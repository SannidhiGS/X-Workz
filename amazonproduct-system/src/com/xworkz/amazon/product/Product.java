package com.xworkz.amazon.product;

public class Product {

        private String productId;
        public void setProductId(String productId){
            this.productId=productId;
        }
        public String getProductId(){
            return productId;
        }

        private String productName;
        public void setProductName(String productName){
            this.productName=productName;
        }
        public String getProductName(){
            return productName;
        }

        private double price;
        public void setPrice(double price){
            this.price=price;
        }
        public double getPrice(){
            return price;
        }

        private String category;
        public void setCategory(String category){
            this.category=category;
        }
        public String getCategory(){
            return category;
        }
        private double rating;
        public void setRating(double rating){
            this.rating=rating;
        }
        public double getRating(){
            return rating;
        }
}
