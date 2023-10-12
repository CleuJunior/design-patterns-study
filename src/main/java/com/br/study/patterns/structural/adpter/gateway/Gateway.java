package com.br.study.patterns.structural.adpter.gateway;

import java.math.BigDecimal;

public interface Gateway {
    void setValue(BigDecimal value);

    void setInstallment(int installment);

    void setCardNumber(String cardNumber);

    void setCvv(String cvv);

    boolean validade();

    boolean doPayment();

}
