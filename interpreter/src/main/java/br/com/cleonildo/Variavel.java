package br.com.cleonildo;

import java.util.List;
import java.util.Map;

public class Variavel implements Expressao {
    private final String variavel;

    public Variavel(String variavel) {
        this.variavel = variavel;
    }

    // Somente uma letra de a-z é aceita
    private boolean validarVariavel() {
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        return alfabeto.contains(variavel);
    }

    @Override
    public int interpretar(Map<String, Integer> contexto) {
        // Se a variável for válida e estiver definida no contexto.
        if (validarVariavel() && variavel.length() == 1 && Character.isLowerCase(variavel.charAt(0))) {
            String chave = variavel.substring(0, 1);
            if (contexto.containsKey(chave)) {
                // Retorna o valor atribuído à variável no contexto.
                return contexto.get(chave);
            }
        }

        // Lança uma exceção caso a variável não esteja definida no contexto.
        throw new IllegalArgumentException(
                "A variável precisa ser uma letra de a-z e estar definida no contexto!"
        );
    }
}

