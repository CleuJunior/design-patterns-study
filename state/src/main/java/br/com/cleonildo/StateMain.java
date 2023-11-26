package br.com.cleonildo;

public class StateMain {
    public static void main( String[] args ) {
        Pedido pedido = new Pedido();

        pedido.sucessoAoPagar();
        pedido.cancelarPedido();
        pedido.sucessoAoPagar();
        pedido.despacharPedido();
    }
}
