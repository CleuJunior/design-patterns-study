package br.com.cleonildo;

import br.com.cleonildo.caixa.BancoCaixaBoleto10Dias;
import br.com.cleonildo.caixa.BancoCaixaBoleto30Dias;
import br.com.cleonildo.caixa.BancoCaixaBoleto60Dias;

public class BoletoSimpleFactory {
    public Boleto criarBoleto(int vencimentoBoleto, float valor) {
        // Criação do boleto conforme o vencimento. A palavra new é utilizada 3 vezes.
        return switch (vencimentoBoleto) {
            case 10 -> new BancoCaixaBoleto10Dias(valor);
            case 30 -> new BancoCaixaBoleto30Dias(valor);
            case 60 -> new BancoCaixaBoleto60Dias(valor);
            default -> throw new RuntimeException("Vencimento Indisponível");
        };
    }
}

