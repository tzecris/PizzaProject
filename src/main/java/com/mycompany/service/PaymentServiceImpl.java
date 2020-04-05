/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.dao.PaymentDaoInt;
import com.mycompany.model.Payment;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Admin
 */
@Transactional
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentDaoInt paymentDaoInt;

    @Override
    public List<Payment> findAll() {

        return paymentDaoInt.findAll();
    }

}
