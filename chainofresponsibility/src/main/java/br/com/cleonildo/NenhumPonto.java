package br.com.cleonildo;

public class NenhumPonto implements CalculadorDePontos {

    @Override
    public int calcularPontos(Pedido pedido) {
        // Se nenhuma das classes anteriores retornou pontos, então o cliente não pontua.
        return 0;
    }

    @Override
    public void setProximo(CalculadorDePontos proximo) {
        // Fim da cadeia, pois esta classe não possui próximo.
    }
}

