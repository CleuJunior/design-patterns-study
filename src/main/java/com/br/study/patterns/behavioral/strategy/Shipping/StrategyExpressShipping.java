package com.br.study.patterns.behavioral.strategy.Shipping;

public class StrategyExpressShipping implements Shipping {

    @Override
    public Double calculate(Double valueOrder) {
        return valueOrder * 0.1;
    }

    @Override
    public String toString() {
        return "Express";
    }
}
