package com.example.real.thinkers.ecommerce.models;



public class Product{


    public int productImage;
    public String quantity;

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Product(String quantity) {
        this.quantity = quantity;
    }

    public Product(String quantity, String title, String price) {
        this.quantity = quantity;
        this.title = title;
        this.price = price;
    }

    public String title;
    public String price;
    public String description;

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

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

