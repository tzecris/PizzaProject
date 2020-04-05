/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.model.BreadSize;
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
public class BreadSizeDaoImpl implements BreadSizeDaoInt {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        Session s = sessionFactory.getCurrentSession();
        return s;
    }

    @Override
    public List<BreadSize> findAll() {
        Query q = getSession().createNamedQuery("BreadSize.findAll");
        List<BreadSize> list = q.getResultList();
        return list;
    }

    @Override
    public BreadSize findById(Integer id) {
        Query q = getSession().createNamedQuery("BreadSize.findById");
        q.setParameter("id", id);
        return (BreadSize) q.getSingleResult();
    }

}
