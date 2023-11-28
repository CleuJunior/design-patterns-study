package br.com.cleonildo.caixa;

import br.com.cleonildo.Boleto;

public class BancoCaixaBoleto10Dias extends Boleto {

    public BancoCaixaBoleto10Dias(float valor) {
        super(valor);
        this.juros = 0.02f;
        this.desconto = 0.1f;
        this.multa = 0.05f;
    }
}

