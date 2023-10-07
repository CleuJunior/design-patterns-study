package com.br.study.patterns.structural.facade.sales.payment;


import com.br.study.patterns.structural.facade.sales.Order;

public class PaymentBillet extends Payment {

    public PaymentBillet(Order order) {
        super(order);
    }

    @Override
    public boolean doPayment() {
        return true;
    }
}
