package com.br.study.patterns.behavioral.chainofresponsibility;

public class Points20Dollars implements ICalculatorPoints{
    private ICalculatorPoints next;

    @Override
    public int calculatePoint(Order order) {
        return order.getValue() >= 20 ?
                (int) (order.getValue() / 10) :
                this.next.calculatePoint(order);
    }

    @Override
    public void setNext(ICalculatorPoints next) {
        this.next = next;
    }
}
