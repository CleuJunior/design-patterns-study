package com.br.study.patterns.behavioral.strategy.Order;

import com.br.study.patterns.behavioral.strategy.Shipping.Shipping;

public abstract class Order {

    protected Double value;
    protected Shipping shippingType;

    protected Order(Double value, Shipping shippingType) {
        this.value = value;
        this.shippingType = shippingType;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Shipping getShippingType() {
        return this.shippingType;
    }

    public void setShippingType(Shipping shippingType) {
        this.shippingType = shippingType;
    }

    public Double calculateShipping() {
        return this.shippingType.calculate(this.value);
    }
}
