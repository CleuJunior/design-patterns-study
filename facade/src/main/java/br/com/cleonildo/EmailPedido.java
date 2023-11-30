package br.com.cleonildo;

public class EmailPedido {
    private final Pedido pedido;

    public EmailPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void enviarEmail(String mensagem) {
        System.out.printf("Email enviado para %s\n", "Cleonildo");
        System.out.printf("Mensagem: %s\n", mensagem);
    }
}
