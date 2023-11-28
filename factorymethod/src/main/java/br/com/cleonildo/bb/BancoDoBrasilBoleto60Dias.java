package br.com.cleonildo.bb;

import br.com.cleonildo.Boleto;

public class BancoDoBrasilBoleto60Dias extends Boleto {

    public BancoDoBrasilBoleto60Dias(float valor) {
        super(valor);
        this.juros = 0.1f;
        this.desconto = 0f;
        this.multa = 0.15f;
    }
}

