package br.com.cleonildo;

import java.util.Map;

public interface Expressao {

    int interpretar(Map<String, Integer> contexto);
}
