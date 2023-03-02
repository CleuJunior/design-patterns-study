package com.br.study.patterns.behavioral.strategy.Order;

import com.br.study.patterns.behavioral.strategy.Shipping.Shipping;

public class ElectronicOrder extends Order{

    private String sectorName;

    public ElectronicOrder(Double value, Shipping shippingType) {
        super(value, shippingType);
    }

    public ElectronicOrder(String sectorName, Double value, Shipping shippingType) {
        super(value, shippingType);
        this.sectorName = sectorName;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    @Override
    public String toString() {
        return "ElectronicOrder:" +
                "\nsectorName=" + this.sectorName + ",\n" +
                "Value=" + super.getValue() + ",\n" +
                "Shipping=" + super.getShippingType() + ",\n" +
                "Shipping value=" + super.calculateShipping() + "\n";
    }
}
