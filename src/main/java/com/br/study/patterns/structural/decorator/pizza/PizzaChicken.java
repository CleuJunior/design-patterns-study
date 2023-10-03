package com.br.study.patterns.structural.decorator.pizza;

public class PizzaChicken extends Pizza {
    private static final float BASE_PRICE = 19.0f;

    public PizzaChicken() {
        super.description = "Chicken Pizza";
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
