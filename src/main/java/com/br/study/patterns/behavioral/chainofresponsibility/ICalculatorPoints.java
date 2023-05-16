package com.br.study.patterns.behavioral.chainofresponsibility;

public interface ICalculatorPoints {

    int calculatePoint(Order order);
    void setNext(ICalculatorPoints next);
}
