package com.mycompany.service;

import com.mycompany.dao.BreadSizeDaoInt;
import com.mycompany.dao.IngredientDaoInt;
import com.mycompany.dto.OrderDTO;
import com.mycompany.dto.PizzaDTO;
import com.mycompany.model.Order;
import com.mycompany.model.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class MappingUtil {

    @Autowired
    BreadSizeDaoInt breadSize;

    @Autowired
    IngredientDaoInt ingedientDao;

    public Order mapOrderDTOToOrder(OrderDTO dto) {
        Order order = new Order();
        order.setId(dto.getId());
        order.setPizza(mapPizzaDTOToPizza(dto.getPizza()));

        return order;
    }

    private Pizza mapPizzaDTOToPizza(PizzaDTO dto) {
        Pizza pizza = new Pizza();
        pizza.setSize(breadSize.findById(dto.getSize()));
        pizza.getIngredients().addAll(ingedientDao.findByIDs(dto.getIngredients()));

        return pizza;
    }


}
