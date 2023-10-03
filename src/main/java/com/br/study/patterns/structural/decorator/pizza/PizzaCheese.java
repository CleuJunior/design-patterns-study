package com.br.study.patterns.structural.decorator.pizza;

public class PizzaCheese extends Pizza {
    private static final float BASE_PRICE = 22.0f;

    public PizzaCheese() {
        super.description = "Cheese Pizza";
    }

    @Override
    public String getDescription() {
        return super.description;
    }

    @Override
    public float getPrice() {
        return BASE_PRICE;
    }
}
