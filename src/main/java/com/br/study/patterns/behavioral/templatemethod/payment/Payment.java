package com.br.study.patterns.behavioral.templatemethod.payment;

import com.br.study.patterns.behavioral.templatemethod.gateway.Gateway;

public abstract class Payment {

    protected Double value;
    protected Gateway gateway;
    private final Double ZERO = 0.0;

    protected Payment(Double value, Gateway gateway) {
        this.value = value;
        this.gateway = gateway;
    }

    public abstract Double calculateDiscount();

    public Double calculateFee() {
        return ZERO;
    }
    public Double collects() {
        double totalValue = this.value + this.calculateFee() - this.calculateDiscount();
        return this.gateway.charge(totalValue);
    }
}
