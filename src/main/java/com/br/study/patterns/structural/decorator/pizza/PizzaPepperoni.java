package com.br.study.patterns.structural.decorator.pizza;

public class PizzaPepperoni extends Pizza {
    private static final float BASE_PRICE = 25.0f;

    public PizzaPepperoni() {
        super.description = "Pepperoni Pizza";
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
