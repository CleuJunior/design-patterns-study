package br.com.cleonildo.caixa;

import br.com.cleonildo.Boleto;

public class BancoCaixaBoleto30Dias extends Boleto {

    public BancoCaixaBoleto30Dias(float valor) {
        super(valor);
        this.juros = 0.05f;
        this.desconto = 0.05f;
        this.multa = 0.1f;
    }
}

