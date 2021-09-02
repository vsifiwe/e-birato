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
public class Client extends User {

    public Client(String email, String password, String phoneNumber) {
        super(email, password, phoneNumber);

    }

}
