package br.com.cleonildo.bb;

import br.com.cleonildo.Boleto;

public class BancoDoBrasilBoleto10Dias extends Boleto {

    public BancoDoBrasilBoleto10Dias(float valor) {
        super(valor);
        this.juros = 0.03f;
        this.desconto = 0.05f;
        this.multa = 0.02f;
    }
}

