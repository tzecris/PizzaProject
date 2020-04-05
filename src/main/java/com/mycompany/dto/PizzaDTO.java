package com.mycompany.dto;

import java.util.List;

/**
 *
 * @author Admin
 */
public class PizzaDTO {

    private List<Integer> ingredients;
    private Integer size;

    public List<Integer> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Integer> ingredients) {
        this.ingredients = ingredients;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }


}
