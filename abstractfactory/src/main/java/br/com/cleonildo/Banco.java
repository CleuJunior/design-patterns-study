package br.com.cleonildo;

import java.math.BigDecimal;

public class Banco {

    public Boleto gerarBoleto(BigDecimal valor, CalculosFactory factory) {
        Boleto boleto = new Boleto(valor, factory);

        System.out.println("Boleto gerado com sucesso");
        System.out.println("Valor Juros: R$" + boleto.calcularJuros());
        System.out.println("Valor Desconto: R$" + boleto.calcularDesconto());
        System.out.println("Valor multa: R$" + boleto.calcularMulta());

        return boleto;
    }

}
