package br.com.cleonildo;

import java.util.List;
import java.util.Map;

public class Divisao extends Operacao {

    public Divisao(Expressao esquerda, Expressao direita) {
        super(esquerda, direita);
    }

    @Override
    public int interpretar(Map<String, Integer> contexto) {
        int divisor = direita.interpretar(contexto);
        if (divisor != 0) {
            return esquerda.interpretar(contexto) / divisor;
        } else {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
    }
}

