package com.br.study.patterns.behavioral.templatemethod.payment;

import com.br.study.patterns.behavioral.templatemethod.gateway.Gateway;

public class PaymentCash extends Payment{
    public PaymentCash(Double value, Gateway gateway) {
        super(value, gateway);
    }

    @Override
    public Double calculateDiscount() {
        return super.value * 0.1;
    }
}
