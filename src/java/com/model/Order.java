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
public class Order {
    @Id
    private String orderId;
    private Client client;
    private Product product;
    private String quantity;
    private boolean statusDelivery;

    public Order() {
    }

    public Order(String orderId, Client client, Product product, String quantity, boolean statusDelivery) {
        this.orderId = orderId;
        this.client = client;
        this.product = product;
        this.quantity = quantity;
        this.statusDelivery = statusDelivery;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public boolean isStatusDelivery() {
        return statusDelivery;
    }

    public void setStatusDelivery(boolean statusDelivery) {
        this.statusDelivery = statusDelivery;
    }
    
    
    
    
}
