package br.com.cleonildo;

import java.util.Map;

public class Adicao extends Operacao {

    public Adicao(Expressao esquerda, Expressao direita) {
        super(esquerda, direita);
    }

    @Override
    public int interpretar(Map<String, Integer> contexto) {
        return esquerda.interpretar(contexto) + direita.interpretar(contexto);
    }
}
