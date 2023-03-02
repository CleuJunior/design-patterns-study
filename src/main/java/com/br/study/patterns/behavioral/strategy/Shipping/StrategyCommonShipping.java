package com.br.study.patterns.behavioral.strategy.Shipping;

public class StrategyCommonShipping implements Shipping {

    @Override
    public Double calculate(Double valueOrder) {
        return valueOrder * 0.05;
    }

    @Override
    public String toString() {
        return "Common";
    }
}
