package com.br.study.patterns.structural.decorator.additional;

import com.br.study.patterns.structural.decorator.pizza.Pizza;

public abstract class AdditionDecorator extends Pizza {
    protected Pizza pizza;

    protected AdditionDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescription();
    public abstract  float getPrice();
}
