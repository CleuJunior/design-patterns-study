package br.com.cleonildo;


import br.com.cleonildo.gateway.Gateway;

import java.math.BigDecimal;

public class Cobranca {
    private Gateway gateway;

    public Cobranca(Gateway gateway) {
        this.gateway = gateway;
    }

    public void setGateway(Gateway gateway) {
        this.gateway = gateway;
    }

    public void setValor(BigDecimal valor) {
        this.gateway.setValor(valor);
    }

    public void setParcelas(int parcelas) {
        this.gateway.setParcelas(parcelas);
    }

    public void setNumeroCartao(String numeroCartao) {
        this.gateway.setNumeroCartao(numeroCartao);
    }

    public void setCvv(String cvv) {
        this.gateway.setCvv(cvv);
    }


    public boolean realizarPagamento() {
        if (gateway instanceof TopPagamentosAdapter) {
            System.out.println("Payment by TopPagamentos");

        } else {
            System.out.println("Payment by PagFacil");
        }
        return true;
    }
}
