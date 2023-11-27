package br.com.cleonildo;


public class IteratorMain {
    public static void main( String[] args ) {
        var lista = new Lista<Integer>(9);

        lista.addItem(1);
        lista.addItem(2);
        lista.addItem(3);
        lista.addItem(4);
        lista.addItem(5);
        lista.addItem(6);
        lista.addItem(7);
        lista.addItem(8);
        lista.addItem(9);
        lista.addItem(10);

        var matriz = new Matriz<Integer>(3, 3);

        matriz.addItem(1);
        matriz.addItem(2);
        matriz.addItem(3);
        matriz.addItem(4);
        matriz.addItem(5);
        matriz.addItem(6);
        matriz.addItem(7);
        matriz.addItem(8);
        matriz.addItem(9);
        matriz.addItem(10);

        var cliente = new ImpressoraDeAgregados();

        cliente.setAgregado(lista);
        System.out.print("Elementos da Lista: ");
        cliente.iterar();

        System.out.println();
        System.out.println("--------------------------------------");

        cliente.setAgregado(matriz);
        System.out.print("Elementos da Matriz: ");
        cliente.iterar();
    }
}
