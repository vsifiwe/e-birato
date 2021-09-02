/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Ineza
 */
@Entity
public class Purchase {
    @Id
    private String purchaseId;
    @ManyToOne
    private Product product;
    private String quantity;

    public Purchase() {
    }

    public Purchase(String purchaseId, Product product, String quantity) {
        this.purchaseId = purchaseId;
        this.product = product;
        this.quantity = quantity;
    }

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
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
    
    
    
}
