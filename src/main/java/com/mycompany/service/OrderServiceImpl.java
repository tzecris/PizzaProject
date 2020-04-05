package com.mycompany.service;

import com.mycompany.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private MappingUtil mappingUtil;

    @Override
    public void saveOrder(OrderDTO order) {

    }


}
