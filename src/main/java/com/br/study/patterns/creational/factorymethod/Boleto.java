package com.br.study.patterns.creational.factorymethod;

import java.math.BigDecimal;

public abstract class Boleto {
    private BigDecimal valor;
    protected BigDecimal juros;
    protected BigDecimal desconto;
    protected BigDecimal multa;


    protected Boleto(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal calcularJuros() {
        return this.valor.multiply(this.juros);
    }

    public BigDecimal calcularDesconto() {
        return this.valor.multiply(this.desconto);
    }

    public BigDecimal calcularMulta() {
        return this.valor.multiply(this.multa);
    }
}
