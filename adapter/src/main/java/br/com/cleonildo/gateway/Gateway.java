package br.com.cleonildo.gateway;

import java.math.BigDecimal;

public interface Gateway {
    void setValor(BigDecimal value);

    void setParcelas(int installment);

    void setNumeroCartao(String numeroCartao);

    void setCvv(String cvv);

    boolean validarCartao();

    boolean realizarPagamento();

}
