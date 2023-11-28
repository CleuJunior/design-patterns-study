package br.com.cleonildo;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    private final List<Expressao> pilha = new ArrayList<>();
    private final String expressao;

    public Parser(String expressao) {
        this.expressao = expressao.trim();
    }

    private boolean isOperacao(String token) {
        String[] operacoes = {"+", "-", "*", "/"};
        for (String operacao : operacoes) {
            if (token.equals(operacao)) {
                return true;
            }
        }
        return false;
    }

    private Numero parseNumero(String token) {
        List<Digito> pilhaNumero = new ArrayList<>();
        int tamanhoOperando = token.length();
        Numero direita = null;

        for (int i = 0; i < tamanhoOperando; i++) {
            String parteToken = token.substring(i, i + 1);

            if (i == tamanhoOperando - 1) {
                pilhaNumero.add(new Digito(parteToken));

                while (!pilhaNumero.isEmpty()) {
                    Digito topoPilha = pilhaNumero.get(pilhaNumero.size() - 1);

                    if (topoPilha != null) {
                        if (direita == null) {
                            direita = new Numero(topoPilha);
                            pilhaNumero.remove(pilhaNumero.size() - 1);
                        } else {
                            direita = new Numero(topoPilha, direita);
                            pilhaNumero.remove(pilhaNumero.size() - 1);
                        }
                    }
                }
            } else {
                pilhaNumero.add(new Digito(parteToken));
            }
        }

        return direita;
    }

    public Expressao parse() {
        String[] expressaoTokens = this.expressao.split(" ");

        for (String token : expressaoTokens) {
            if (isOperacao(token)) {
                Expressao operandoDireita = pilha.get(pilha.size() - 1);
                pilha.remove(pilha.size() - 1);

                Expressao operandoEsquerda = pilha.get(pilha.size() - 1);
                pilha.remove(pilha.size() - 1);

                switch (token) {
                    case "+":
                        pilha.add(new Adicao(operandoEsquerda, operandoDireita));
                        break;
                    case "-":
                        pilha.add(new Subtracao(operandoEsquerda, operandoDireita));
                        break;
                    case "*":
                        pilha.add(new Multiplicacao(operandoEsquerda, operandoDireita));
                        break;
                    case "/":
                        pilha.add(new Divisao(operandoEsquerda, operandoDireita));
                        break;
                }
            } else if (token.matches("\\d+")) {
                pilha.add(parseNumero(token));
            } else {
                pilha.add(new Variavel(token));
            }
        }

        return pilha.get(pilha.size() - 1);
    }
}

