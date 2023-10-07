package com.br.study.patterns.structural.facade.sales.payment;


import com.br.study.patterns.structural.facade.sales.Order;

public abstract class Payment {
    protected Order order;

    protected Payment(Order order) {
        this.order = order;
    }

    public abstract boolean doPayment();
}
