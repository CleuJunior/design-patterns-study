package com.br.study.patterns.behavioral.templatemethod.payment;

import com.br.study.patterns.behavioral.templatemethod.gateway.Gateway;

public class PaymentCredit  extends Payment {

    public PaymentCredit(Double value, Gateway gateway) {
        super(value, gateway);
    }

    @Override
    public Double calculateFee() {
        return super.value * 0.05;
    }

    @Override
    public Double calculateDiscount() {
        if(super.value > 300)
            return super.value * 0.02;

        return 0.0;
    }
}
