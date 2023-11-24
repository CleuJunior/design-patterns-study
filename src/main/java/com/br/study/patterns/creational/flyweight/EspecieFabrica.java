package com.br.study.patterns.creational.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EspecieFabrica {
    private final List<EspecieFlyweight> especies = new ArrayList<>();

    public EspecieFlyweight getEspecie(String nome, String cor, float alturaMaxima) {
        for (EspecieFlyweight especie: especies) {
            if(Objects.equals(especie.nome(), nome) && Objects.equals(especie.cor(), cor) && especie.alturaMaxima() == alturaMaxima) {
                return  especie;
            }
        }

        var novaEspecie = new EspecieFlyweight(nome, cor, alturaMaxima);
        this.especies.add(novaEspecie);
        return novaEspecie;
    }

    public List<EspecieFlyweight> retornaTodasEspecies() {
        return this.especies;
    }
}
