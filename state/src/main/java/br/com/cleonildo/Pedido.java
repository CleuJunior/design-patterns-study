package br.com.cleonildo;

import br.com.cleonildo.states.AguardandoPagamentoState;
import br.com.cleonildo.states.CanceladoState;
import br.com.cleonildo.states.PagoState;
import br.com.cleonildo.states.EnviadoState;
import br.com.cleonildo.states.State;

public class Pedido {
    private State estatosAtual;
    private final State aguardandoPagamento;
    private final State pago;
    private final State cancelado;
    private final State enviado;

    public Pedido() {
        this.aguardandoPagamento = new AguardandoPagamentoState(this);
        this.pago = new PagoState(this);
        this.cancelado = new CanceladoState(this);
        this.enviado = new EnviadoState(this);
        this.estatosAtual = this.aguardandoPagamento;
    }

    public void sucessoAoPagar() {
        try {
            this.estatosAtual.sucessoAoPagar();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void cancelarPedido() {
        try {
            this.estatosAtual.despacharPedido();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void despacharPedido() {
        try {
            this.estatosAtual.cancelarPedido();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public State getAguardandoPagamento() {
        return aguardandoPagamento;
    }

    public State getPago() {
        return pago;
    }

    public State getCancelado() {
        return cancelado;
    }

    public State getEnviado() {
        return enviado;
    }

    public void setEstatosAtual(State estatosAtual) {
        this.estatosAtual = estatosAtual;
    }
}
