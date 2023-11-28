package br.com.cleonildo;

public interface CalculadorDePontos {

    //Calcula os pontos gerados pelo pedido.
    int calcularPontos(Pedido pedido);
    //Define o próximo objeto calculador de pontos da cadeia.
    void setProximo(CalculadorDePontos proximo);
}
