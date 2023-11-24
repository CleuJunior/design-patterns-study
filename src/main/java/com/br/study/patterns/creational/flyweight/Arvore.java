package com.br.study.patterns.creational.flyweight;

import java.util.Map;

public record Arvore(int x, int y, EspecieFlyweight flyweight) {

    public Map<String, String> retornaArvore() {
        var especie = this.flyweight.retornaEspecie().toString();

        return Map.of(
                "x", String.valueOf(this.x),
                "y", String.valueOf(this.y),
                "especie", especie
        );
    }
}
