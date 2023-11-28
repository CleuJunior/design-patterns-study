package br.com.cleonildo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Digito implements Expressao {
    private final String digito;

    public Digito(String digito) {
        this.digito = digito;
    }

    private boolean validarDigito() {
        List<String> digitos = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
        return digitos.contains(this.digito);
    }

    @Override
    public int interpretar(Map<String, Integer> contexto) {
        if (validarDigito()) {
            return Integer.parseInt(this.digito);
        }
        throw new RuntimeException("Todo dígito deve ser um inteiro entre 0 e 9");
    }
}

