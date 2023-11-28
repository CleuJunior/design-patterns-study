package br.com.cleonildo;

import java.util.HashMap;
import java.util.Map;

public class InterpreterMain {
    public static void main(String[] args) {
        // O parser é criado recebendo a expressão em seu construtor.
        Parser parser = new Parser("9 5 + x - 20 2 * 10 - y / -");
        // A árvore sintática abstrata é gerada automaticamente pelo parser.
        Expressao arvore = parser.parse();
        // O contexto é um mapa que define quanto vale cada variável.
        Map<String, Integer> contexto = new HashMap<>();
        contexto.put("x", 2);
        contexto.put("y", 3);
        // Início da recursão de interpretação.
        System.out.println(arvore.interpretar(contexto));
    }
}
