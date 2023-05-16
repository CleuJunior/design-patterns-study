package com.br.study.patterns.behavioral.chainofresponsibility;

public class CalculatorPoints {

    public static int calculatorPointsOrder(Order order, int day) {
        Points70Dollars p70 = new Points70Dollars();
        Points40Dollars p40 = new Points40Dollars();
        Points20Dollars p20 = new Points20Dollars();
        ZeroPoints zero = new ZeroPoints();

        p70.setNext(p40);
        p40.setNext(p20);
        p20.setNext(zero);

        if (day >= 16 && day <= 31)
            return p70.calculatePoint(order) * 2;

        return p70.calculatePoint(order);
    }
}
