package br.com.cleonildo.caixa;

import br.com.cleonildo.Boleto;

public class BancoCaixaBoleto60Dias extends Boleto {

    public BancoCaixaBoleto60Dias(float valor) {
        super(valor);
        this.juros = 0.10f;
        this.desconto = 0f;
        this.multa = 0.2f;
    }
}
