package br.com.cleonildo;

public class Pontos70Reais implements CalculadorDePontos {
    private CalculadorDePontos proximoCalculadorDePontos;

    @Override
    public int calcularPontos(Pedido pedido) {
        // Se o valor do pedido for maior ou igual a 70 reais.
        if (pedido.getValor() >= 70) {
            // Retorne o resultado inteiro arredondado para baixo do valor do pedido dividido por 5.
            return (int) Math.floor(pedido.getValor() / 5);
        }
        // Senão, chame o método calcularPontos() do próximo calculador de pontos.
        return proximoCalculadorDePontos.calcularPontos(pedido);
    }

    /**
     * Guarda a referência do objeto da cadeia.
     * Caso o método calcularPontos() da classe Pontos70Reais não consiga fazer o cálculo,
     * o método calcularPontos() de this.proximoCalculadoraDePontos será chamado.
     */
    public void setProximo(CalculadorDePontos proximo) {
        this.proximoCalculadorDePontos = proximo;
    }
}

