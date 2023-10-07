package com.br.study.patterns.structural.facade.sales.payment;


import com.br.study.patterns.structural.facade.sales.Order;

public class PaymentCredit extends Payment {

    public PaymentCredit(Order order) {
        super(order);
    }

    @Override
    public boolean doPayment() {
        return true;
    }
}
