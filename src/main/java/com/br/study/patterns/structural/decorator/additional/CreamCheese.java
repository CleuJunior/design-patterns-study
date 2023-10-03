package com.br.study.patterns.structural.decorator.additional;

import com.br.study.patterns.structural.decorator.pizza.Pizza;

public class CreamCheese extends AdditionDecorator {
    private static final float BASE_ADDITION_PRICE = 8.5f;

    public CreamCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.pizza.getDescription() + " + cream cheese";
    }

    @Override
    public float getPrice() {
        return super.pizza.getPrice() + BASE_ADDITION_PRICE;
    }
}
