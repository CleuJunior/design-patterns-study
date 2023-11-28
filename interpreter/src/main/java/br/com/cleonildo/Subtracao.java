package br.com.cleonildo;

import java.util.List;
import java.util.Map;

public class Subtracao extends Operacao {

    public Subtracao(Expressao esquerda, Expressao direita) {
        super(esquerda, direita);
    }

    @Override
    public int interpretar(Map<String, Integer> contexto) {
        return esquerda.interpretar(contexto) - direita.interpretar(contexto);
    }
}
