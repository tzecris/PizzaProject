/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.dao.BreadSizeDaoImpl;
import com.mycompany.model.BreadSize;
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

public class BreadSizeServiceImp implements BreadSizeService {

    @Autowired
    private BreadSizeDaoImpl dao;

    @Override
    public List<BreadSize> findAll() {
        return dao.findAll();
    }

}
