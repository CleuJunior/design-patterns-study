package com.br.study.patterns.creational.abstractfactory;

import java.math.BigDecimal;

public class Boleto {
    private BigDecimal valor;
    protected Juros juros;
    protected Desconto desconto;
    protected Multa multa;


    protected Boleto(BigDecimal valor, CalculosFactory factory) {
        this.valor = valor;
        this.juros = factory.criarJuros();
        this.desconto = factory.criarDesconto();
        this.multa = factory.criarMulta();
    }

    public BigDecimal calcularJuros() {
        return this.valor.multiply(this.juros.getJuros());
    }

    public BigDecimal calcularDesconto() {
        return this.valor.multiply(this.desconto.getDesconto());
    }

    public BigDecimal calcularMulta() {
        return this.valor.multiply(this.multa.getMulta());
    }
}
