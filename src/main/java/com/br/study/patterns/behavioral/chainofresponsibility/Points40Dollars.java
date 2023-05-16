package com.br.study.patterns.behavioral.chainofresponsibility;

public class Points40Dollars implements ICalculatorPoints{
    private ICalculatorPoints next;

    @Override
    public int calculatePoint(Order order) {
        return order.getValue() >= 40 ?
                (int) (order.getValue() / 7) :
                this.next.calculatePoint(order);
    }

    @Override
    public void setNext(ICalculatorPoints next) {
        this.next = next;
    }
}
