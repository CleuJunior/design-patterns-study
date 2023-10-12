package com.br.study.patterns.structural.adpter.thirdparty;

import java.math.BigDecimal;

public class PagFacil {
    private BigDecimal value;
    private int installment;
    private String cardNumber;
    private String cvv;

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setInstallment(int installment) {
        this.installment = installment;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public boolean validade() {
        return !this.cardNumber.isBlank() && !this.cvv.isBlank() && this.cvv.length() == 3;
    }

    public boolean doPayment() {
        System.out.println("Payment by PagFacil");
        return true;
    }
}
