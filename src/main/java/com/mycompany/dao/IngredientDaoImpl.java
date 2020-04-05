/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.model.Ingredient;
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
public class IngredientDaoImpl implements IngredientDaoInt {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        Session s = sessionFactory.getCurrentSession();
        return s;
    }

    @Override
    public List<Ingredient> findAll() {
        Query q = getSession().createNamedQuery("Ingredient.findAll");
        List<Ingredient> list = q.getResultList();
        return list;
    }

}
