package br.com.cleonildo.payment;


import br.com.cleonildo.gateway.Gateway;

public class PagamentoCredito extends Pagamento {

    public PagamentoCredito(Double value, Gateway gateway) {
        super(value, gateway);
    }

    @Override
    public Double calcularTaxa() {
        return super.valor * 0.05;
    }

    @Override
    public Double calcularDesconto() {
        if(super.valor > 300)
            return super.valor * 0.02;

        return 0.0;
    }
}
