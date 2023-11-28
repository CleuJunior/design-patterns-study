package br.com.cleonildo.caixa;

import br.com.cleonildo.Boleto;
import br.com.cleonildo.BoletoSimpleFactory;

public class BancoCaixa {
    private final BoletoSimpleFactory boletoSimpleFactory;

    public BancoCaixa(BoletoSimpleFactory boletoSimpleFactory) {
        // As criações dos boletos saíram daqui. A palavra new não é mais utilizada.
        this.boletoSimpleFactory = boletoSimpleFactory;
    }

    public Boleto gerarBoleto(int vencimentoBoleto, float valor) {
        Boleto boleto = this.boletoSimpleFactory.criarBoleto(vencimentoBoleto, valor);
        System.out.println("Boleto gerado com sucesso no valor de R$ " + valor);
        System.out.println("Valor Juros: R$" + boleto.calcularJuros());
        System.out.println("Valor Desconto: R$" + boleto.calcularDesconto());
        System.out.println("Valor Multa: R$" + boleto.calcularMulta());
        System.out.println("---------------\n\n");
        return boleto;
    }
}

