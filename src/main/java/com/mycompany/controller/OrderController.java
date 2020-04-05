/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.model.BreadSize;
import com.mycompany.model.Ingredient;
import com.mycompany.model.Orders;
import com.mycompany.service.BreadSizeService;
import com.mycompany.service.IngredientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private BreadSizeService breadSizeService;

    @Autowired
    private IngredientService ingredientService;

    @GetMapping
    public String orderForm(Model m) {
        Orders order = new Orders();
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

    @PostMapping("/submitOrder")
    public String showOrder(
            @RequestParam("size") String size,
            @RequestParam("ingredients") List<String> ingredients,
            @RequestParam("payment") String payment,
            @RequestParam("name") String name,
            @RequestParam("age") int age,
            Model model
    ) {
        model.addAttribute("size", size);
        model.addAttribute("ingredients", ingredients);
        model.addAttribute("payment", payment);
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "showOrder";
    }

}
