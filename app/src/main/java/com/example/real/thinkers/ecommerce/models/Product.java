package com.example.real.thinkers.ecommerce.models;

public class Product {


    private int productImage;
    private String title;
    private String price;
    private String description;

    // Constructor that is used to create an instance of the Product object
    public Product(int productImage, String title, String description, String price) {
        this.productImage = productImage;
        this.title = title;
        this.description = description;
        this.price = price;
    }


    public Product() {
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public String getTitle(int position) {
        return title;
    }

    public String getDescription(int position) {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice(int position) {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

