package com.br.study.patterns.structural.decorator.additional;

import com.br.study.patterns.structural.decorator.pizza.Pizza;

public class Wholemeal extends AdditionDecorator {
    private static final float BASE_ADDITION_PRICE = 5.0f;

    public Wholemeal(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.pizza.getDescription() + " + wholemeal pasta";
    }

    @Override
    public float getPrice() {
        return super.pizza.getPrice() + BASE_ADDITION_PRICE;
    }
}
