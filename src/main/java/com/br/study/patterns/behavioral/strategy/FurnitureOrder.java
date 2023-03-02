package com.br.study.patterns.behavioral.strategy;

public class FurnitureOrder extends Order{

    private String sectorName;

    public FurnitureOrder(Double value, Shipping shippingType) {
        super(value, shippingType);
    }

    public FurnitureOrder(String sectorName, Double value, Shipping shippingType) {
        super(value, shippingType);
        this.sectorName = sectorName;
    }

    public String getSectorName() { return sectorName; }

    public void setSectorName(String sectorName) { this.sectorName = sectorName; }

    @Override
    public String toString() {
        return "FurnitureOrder:" +
                "\nsectorName=" + this.sectorName + ",\n" +
                "Value=" + super.getValue() + ",\n" +
                "Shipping=" + super.getShippingType() + ",\n" +
                "Shipping value=" + super.calculateShipping() + "\n";
    }
}
