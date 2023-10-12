package com.br.study.patterns.structural.adpter.thirdparty;

import java.math.BigDecimal;

public class TopPagamentos {
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

    public void setCard(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    public boolean doPayment() {
        System.out.println("Payment by TopPagamentos");
        return true;
    }
}
