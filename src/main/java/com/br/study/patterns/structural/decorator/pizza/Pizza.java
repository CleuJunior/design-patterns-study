package com.br.study.patterns.structural.decorator.pizza;

public abstract class Pizza {
    protected String description = "Description not defined";
    protected float price;

    public abstract String getDescription();
    public abstract float getPrice();
}
