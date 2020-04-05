/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.model.Ingredient;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mycompany.dao.IngredientDaoInt;

/**
 *
 * @author Admin
 */
@Transactional
@Service
public class IngredientServiceImpl implements IngredientService {
    @Autowired
    IngredientDaoInt dao;

    @Override
    public List<Ingredient> findAll() {
        return dao.findAll();
    }

}
