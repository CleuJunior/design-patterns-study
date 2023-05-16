package com.br.study.patterns.behavioral.chainofresponsibility;

public class Points70Dollars implements ICalculatorPoints{
    private ICalculatorPoints next;

    @Override
    public int calculatePoint(Order order) {
        return order.getValue() >= 70 ?
                (int) (order.getValue() / 5) :
                this.next.calculatePoint(order);

    }

    @Override
    public void setNext(ICalculatorPoints next) {
        this.next = next;

    }
}
