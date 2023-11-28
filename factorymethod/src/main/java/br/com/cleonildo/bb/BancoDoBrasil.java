package br.com.cleonildo.bb;

import br.com.cleonildo.Banco;
import br.com.cleonildo.Boleto;

public class BancoDoBrasil extends Banco {

    @Override
    protected Boleto criarBoleto(int vencimentoBoleto, float valor) {
        return switch (vencimentoBoleto) {
            case 10 -> new BancoDoBrasilBoleto10Dias(valor);
            case 30 -> new BancoDoBrasilBoleto30Dias(valor);
            case 60 -> new BancoDoBrasilBoleto60Dias(valor);
            default -> null;
        };
    }
}
