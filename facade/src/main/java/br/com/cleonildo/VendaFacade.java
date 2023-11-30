package br.com.cleonildo;

public class VendaFacade {
    private final Pedido pedido;
    private Pagamento pagamento;
    private final EmailPedido emailPedido;

    public VendaFacade(Consumidor consumidor) {
        this.pedido = new Pedido(consumidor);
        this.emailPedido = new EmailPedido(this.pedido);
    }

    public void addProduto(Produto produto) {
        this.pedido.addProduto(produto);
    }

    public void pedidoCredito() {
        this.pagamento = new PagamentoCredito(this.pedido);

        if (this.pagamento.realizarPagamento()) {
            this.emailPedido.enviarEmail("Pagamento realizado com sucesso via crédito");
        } else {
            this.emailPedido.enviarEmail("Falha no pagamento via crédito");
        }
    }

    public void pedidoBoleto() {
        this.pagamento = new PagamentoBoleto(this.pedido);

        if (this.pagamento.realizarPagamento()) {
            this.emailPedido.enviarEmail("Pagamento realizado com sucesso via boleto");
        } else {
            this.emailPedido.enviarEmail("Falha no pagamento do boleto");
        }
    }
}

