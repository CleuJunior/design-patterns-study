package br.com.cleonildo;

public interface CalculosFactory {
    Juros criarJuros();

    Desconto criarDesconto();

    Multa criarMulta();
}
