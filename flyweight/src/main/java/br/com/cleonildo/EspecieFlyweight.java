package br.com.cleonildo;

import java.util.Map;

public record EspecieFlyweight(String nome, String cor, float alturaMaxima) {

    public Map<String, String> retornaEspecie() {
        var alturaMaximaString = String.valueOf(this.alturaMaxima);

        return Map.of(
                "nome", this.nome,
                "cor", this.cor,
                "alturaMaxima", alturaMaximaString
        );
    }
}
