package br.com.cleonildo;


public class ChainOfResponsabilityMain {

    public static void main(String[] args) {
        // Criação de um pedido.
        Pedido pedido = new Pedido();
        // Criação da calculadora de pontos.
        CalculadoraDePontos calculadoraDePontos = new CalculadoraDePontos();

        // Definição do valor do pedido igual a 21 reais.
        pedido.setValor(21);
        // Cálculo de pontos na primeira quinzena (dia 15).
        System.out.println("Dia 15: " + calculadoraDePontos.calcularPontosDoPedido(pedido, 15) + " Pontos");
        // Cálculo de pontos na segunda quinzena (dia 16).
        System.out.println("Dia 16: " + calculadoraDePontos.calcularPontosDoPedido(pedido, 16) + " Pontos");

        // Apenas para separar os resultados.
        System.out.println("---------------------------");

        // Mudança do valor do pedido para 100 reais.
        pedido.setValor(100);
        // Cálculo de pontos na primeira quinzena (dia 15).
        System.out.println("Dia 15: " + calculadoraDePontos.calcularPontosDoPedido(pedido, 15) + " Pontos");
        // Cálculo de pontos na segunda quinzena (dia 16).
        System.out.println("Dia 16: " + calculadoraDePontos.calcularPontosDoPedido(pedido, 16) + " Pontos");
    }
}
