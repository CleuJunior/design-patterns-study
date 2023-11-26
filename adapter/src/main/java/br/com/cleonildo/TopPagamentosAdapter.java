package br.com.cleonildo;


import br.com.cleonildo.gateway.Gateway;
import br.com.cleonildo.thirdparty.TopPagamentos;

import java.math.BigDecimal;

public class TopPagamentosAdapter implements Gateway {
    private final TopPagamentos topPagamentos;
    private String numeroCartao = null;
    private String cvv = null;

    public TopPagamentosAdapter(TopPagamentos topPagamentos) {
        this.topPagamentos = topPagamentos;
    }

    @Override
    public void setValor(BigDecimal valor) {
        this.topPagamentos.setValue(valor);
    }

    @Override
    public void setParcelas(int installment) {
        this.topPagamentos.setInstallment(installment);
    }

    @Override
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;

        if (this.cvv != null) {
            this.topPagamentos.setCard(this.numeroCartao, this.cvv);
        }
    }

    @Override
    public void setCvv(String cvv) {
        this.cvv = cvv;

        if (this.numeroCartao != null) {
            this.topPagamentos.setCard(this.numeroCartao, this.cvv);
        }
    }

    @Override
    public boolean validarCartao() {
        return true;
    }

    @Override
    public boolean realizarPagamento() {
        return this.topPagamentos.realizarPagamento();
    }
}
