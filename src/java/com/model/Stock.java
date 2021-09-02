package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Stock {
    @Id
    private String stockId;
    @OneToOne
    private Product product;
    private Long size;

    public Stock() {
    }

    public Stock(String stockId, Product product, Long size) {
        this.stockId = stockId;
        this.product = product;
        this.size = size;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }
    
    
}
