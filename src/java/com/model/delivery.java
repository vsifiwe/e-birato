/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Ineza
 */
@Entity
public class delivery {

    @Id
    private String deliveryId;
    @OneToOne
    private Order Order;
    private String location;

    public delivery() {
    }

    public delivery(String deliveryId, Order Order, String location) {
        this.deliveryId = deliveryId;
        this.Order = Order;
        this.location = location;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Order getOrder() {
        return Order;
    }

    public void setOrder(Order Order) {
        this.Order = Order;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    

}
