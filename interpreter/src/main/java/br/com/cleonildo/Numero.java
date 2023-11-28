package br.com.cleonildo;

import java.util.Map;

public class Numero implements Expressao {

    //Todo número tem ao menos um dígito
    private final Digito esquerda;

    //Caso um número tenha mais de um dígito
    //ele será composto por outro Numero.
    private final Numero direita;

    //Pode receber uma ou duas expressões em seu construtor.
    //Digito e Numero são do supertipo Expressao
    public Numero(Digito esquerda, Numero direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public Numero(Digito esquerda) {
        this(esquerda, null);
    }

    @Override
    public int interpretar(Map<String, Integer> contexto) {
        // Se a direita for vazia (número de apenas um dígito)
        if (direita == null) {
            // Interpreta somente o lado esquerdo
            return esquerda.interpretar(contexto);
        }

        // Interpreta o lado esquerdo e concatena a interpretação do lado direito.
        // Retorna o resultado da concatenação convertido em inteiro.
        return Integer.parseInt(
                Integer.toString(esquerda.interpretar(contexto)) +
                        Integer.toString(direita.interpretar(contexto))
        );
    }
}

