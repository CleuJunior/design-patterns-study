package br.com.cleonildo.bb;

import br.com.cleonildo.Boleto;

public class BancoDoBrasilBoleto30Dias extends Boleto {

    public BancoDoBrasilBoleto30Dias(float valor) {
        super(valor);
        this.juros = 0.05f;
        this.desconto = 0.02f;
        this.multa = 0.5f;
    }
}

