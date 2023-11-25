package br.com.cleonildo.payment;

import br.com.cleonildo.gateway.Gateway;

public abstract class Pagamento {
    protected Double valor;
    protected Gateway gateway;
    private static final Double ZERO = 0.0;

    protected Pagamento(Double valor, Gateway gateway) {
        this.valor = valor;
        this.gateway = gateway;
    }

    public abstract Double calcularDesconto();

    public Double calcularTaxa() {
        return ZERO;
    }
    public Double realizaCobranca() {
        double valorTotal = this.valor + this.calcularTaxa() - this.calcularDesconto();
        return this.gateway.cobrar(valorTotal);
    }
}
