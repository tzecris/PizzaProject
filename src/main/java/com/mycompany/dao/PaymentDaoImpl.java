/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.model.Payment;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public class PaymentDaoImpl implements PaymentDaoInt {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        Session s = sessionFactory.getCurrentSession();
        return s;
    }

    @Override
    public List<Payment> findAll() {
        Query q = getSession().createNamedQuery("Payment.findAll");
        List<Payment> paymenList = q.getResultList();
        return paymenList;
    }

}
