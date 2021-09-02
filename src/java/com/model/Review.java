/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Ineza
 */
@Entity
public class Review {
    @Id
    private String reviewId;
    private Product product;
    private Client client;
    private String message;

    public Review() {
    }

    public Review(String reviewId, Product product, Client client, String message) {
        this.reviewId = reviewId;
        this.product = product;
        this.client = client;
        this.message = message;
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
