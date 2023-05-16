package com.br.study.patterns.behavioral.chainofresponsibility;

public class ZeroPoints implements ICalculatorPoints{
    private ICalculatorPoints next;

    @Override
    public int calculatePoint(Order order) {
        return 0;
    }

    @Override
    public void setNext(ICalculatorPoints next) {
    }
}
