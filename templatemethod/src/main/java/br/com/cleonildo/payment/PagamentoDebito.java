package br.com.cleonildo.payment;

import br.com.cleonildo.gateway.Gateway;

public class PagamentoDebito extends Pagamento {

    public PagamentoDebito(Double value, Gateway gateway) {
        super(value, gateway);
    }

    @Override
    public Double calcularTaxa() {
        return 4.0;
    }

    @Override
    public Double calcularDesconto() {
        return super.valor * 0.05;
    }
}
