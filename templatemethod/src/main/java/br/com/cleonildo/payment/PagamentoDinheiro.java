package br.com.cleonildo.payment;


import br.com.cleonildo.gateway.Gateway;

public class PagamentoDinheiro extends Pagamento {
    public PagamentoDinheiro(Double value, Gateway gateway) {
        super(value, gateway);
    }

    @Override
    public Double calcularDesconto() {
        return super.valor * 0.1;
    }
}
