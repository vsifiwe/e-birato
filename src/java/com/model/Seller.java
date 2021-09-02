package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seller extends User {

    private String uploadProduct;
    

    public Seller() {
    }

    public Seller(String email, String password, String phoneNumber) {
        super(email, password, phoneNumber);

    }
    
    

}
