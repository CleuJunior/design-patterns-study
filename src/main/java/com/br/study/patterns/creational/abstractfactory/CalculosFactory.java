package com.br.study.patterns.creational.abstractfactory;

public interface CalculosFactory {
    Juros criarJuros();

    Desconto criarDesconto();

    Multa criarMulta();
}
