package com.br.study.patterns.structural.adpter;

import com.br.study.patterns.structural.adpter.gateway.Gateway;

import java.math.BigDecimal;

public class Charge {
    private Gateway gateway;

    public Charge(Gateway gateway) {
        this.gateway = gateway;
    }

    public void setGateway(Gateway gateway) {
        this.gateway = gateway;
    }

    public void setValue(BigDecimal value) {
        this.gateway.setValue(value);
    }

    public void setInstallment(int installment) {
        this.gateway.setInstallment(installment);
    }

    public void setCardNumber(String cardNumber) {
        this.gateway.setCardNumber(cardNumber);
    }

    public void setCvv(String cvv) {
        this.gateway.setCvv(cvv);
    }


    public boolean doPayment() {
        if (gateway instanceof TopPagamentoslAdapter) {
            System.out.println("Payment by TopPagamentos");

        } else {
            System.out.println("Payment by PagFacil");
        }
        return true;
    }
}
