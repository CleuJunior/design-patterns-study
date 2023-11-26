package br.com.cleonildo.thirdparty;

import java.math.BigDecimal;

public class PagFacil {
    private BigDecimal value;
    private int installment;
    private String cardNumber;
    private String cvv;

    public void setValor(BigDecimal value) {
        this.value = value;
    }

    public void setParcelas(int installment) {
        this.installment = installment;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.cardNumber = numeroCartao;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public boolean validarCartao() {
        return !this.cardNumber.isBlank() && !this.cvv.isBlank() && this.cvv.length() == 3;
    }

    public boolean realizarPagamento() {
        System.out.println("Payment by PagFacil");
        return true;
    }
}
