package br.com.cleonildo;

public class Pontos20Reais implements CalculadorDePontos {
    private CalculadorDePontos proximoCalculadorDePontos;

    @Override
    public int calcularPontos(Pedido pedido) {
        // Se o valor do pedido for maior ou igual a 20 reais.
        if (pedido.getValor() >= 20) {
            // Retorne o resultado inteiro do valor do pedido dividido por 10.
            return (int) Math.floor(pedido.getValor() / 10);
        }
        // Senão, chame o método calcularPontos() do próximo calculador de pontos.
        return proximoCalculadorDePontos.calcularPontos(pedido);
    }

    /**
     *  Guarda a referência do objeto da cadeia.
     *  Caso o método calcularPontos() da classe Pontos20Reais não consiga fazer o cálculo,
     *  o método calcularPontos() de this.proximoCalculadoraDePontos será chamado.
     */
    public void setProximo(CalculadorDePontos proximo) {
        this.proximoCalculadorDePontos = proximo;
    }
}

