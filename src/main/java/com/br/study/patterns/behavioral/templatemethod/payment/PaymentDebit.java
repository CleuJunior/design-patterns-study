package com.br.study.patterns.behavioral.templatemethod.payment;

import com.br.study.patterns.behavioral.templatemethod.gateway.Gateway;

public class PaymentDebit extends Payment {

    public PaymentDebit(Double value, Gateway gateway) {
        super(value, gateway);
    }

    @Override
    public Double calculateFee() {
        return 4.0;
    }

    @Override
    public Double calculateDiscount() {
        return super.value * 0.05;
    }
}
