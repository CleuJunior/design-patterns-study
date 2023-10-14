package com.br.study.patterns.creational.factorymethod;

import java.math.BigDecimal;

public abstract class Banco {

    public Boleto gerarBoleto(int vencimentoBoleto, BigDecimal valor) {
        Boleto boleto = this.criarBoleto(vencimentoBoleto, valor);

        System.out.println("Boleto gerado com sucesso no valor de " + valor);
        System.out.println("Valor Juros: R$" + boleto.calcularJuros());
        System.out.println("Valor Desconto: R$" + boleto.calcularDesconto());
        System.out.println("Valor multa: R$" + boleto.calcularMulta());

        return boleto;
    }

    protected abstract Boleto criarBoleto(int vencimentoBoleto, BigDecimal valor);

}
