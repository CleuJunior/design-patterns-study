package com.br.study.patterns.structural.adpter;

import com.br.study.patterns.structural.adpter.gateway.Gateway;
import com.br.study.patterns.structural.adpter.thirdparty.TopPagamentos;

import java.math.BigDecimal;

public class TopPagamentoslAdapter implements Gateway {
    private final TopPagamentos topPagamentos;
    private String cardNumber = null;
    private String cvv = null;

    public TopPagamentoslAdapter(TopPagamentos topPagamentos) {
        this.topPagamentos = topPagamentos;
    }

    @Override
    public void setValue(BigDecimal value) {
        this.topPagamentos.setValue(value);
    }

    @Override
    public void setInstallment(int installment) {
        this.topPagamentos.setInstallment(installment);
    }

    @Override
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;

        if (this.cvv != null) {
            this.topPagamentos.setCard(this.cardNumber, this.cvv);
        }
    }

    @Override
    public void setCvv(String cvv) {
        this.cvv = cvv;

        if (this.cardNumber != null) {
            this.topPagamentos.setCard(this.cardNumber, this.cvv);
        }
    }

    @Override
    public boolean validade() {
        return true;
    }

    @Override
    public boolean doPayment() {
        return this.topPagamentos.doPayment();
    }
}
