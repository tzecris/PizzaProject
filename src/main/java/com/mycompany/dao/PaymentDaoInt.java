/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.model.Payment;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface PaymentDaoInt {

    public List<Payment> findAll();
}
