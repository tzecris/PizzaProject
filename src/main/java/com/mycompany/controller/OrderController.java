package com.mycompany.controller;

import com.mycompany.dto.OrderDTO;
import com.mycompany.model.BreadSize;
import com.mycompany.model.Ingredient;
import com.mycompany.model.Order;
import com.mycompany.model.Payment;
import com.mycompany.service.BreadSizeService;
import com.mycompany.service.IngredientService;
import com.mycompany.service.PaymentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private BreadSizeService breadSizeService;

    @Autowired
    private IngredientService ingredientService;

    @Autowired
    private PaymentService paymentService;

    @GetMapping
    public String orderForm(Model m) {
        OrderDTO order = new OrderDTO();
        m.addAttribute("order", order);
        return "ordermapping";
    }

    @ModelAttribute("sizes")
    public List<BreadSize> getSizes() {
        return breadSizeService.findAll();
    }

    @ModelAttribute("ingredients")
    public List<Ingredient> getIngredient() {
        return ingredientService.findAll();
    }
    @ModelAttribute("payments")
    public List<Payment> getPayment() {
        return paymentService.findAll();
    }

    @PostMapping("/submitOrder")
    public String showOrder(Model m, @ModelAttribute("order") OrderDTO order) {
        System.out.println(order.toString());
        return "showOrder";
    }

}
