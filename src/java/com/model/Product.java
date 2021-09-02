package com.model;

public class Product {
    private String id;
    private String productName;
    private String photo;
    private Long price;
    private String description;
    private String shoeSize;

    public Product() {
    }

    public Product(String id, String productName, String photo, Long price, String description, String shoeSize) {
        this.id = id;
        this.productName = productName;
        this.photo = photo;
        this.price = price;
        this.description = description;
        this.shoeSize = shoeSize;
    }

  
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(String shoeSize) {
        this.shoeSize = shoeSize;
    }
    
    
    
}
