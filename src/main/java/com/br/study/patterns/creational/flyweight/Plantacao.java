package com.br.study.patterns.creational.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Plantacao {
    private final List<Arvore> arvores = new ArrayList<>();
    private final EspecieFabrica especieFabrica;

    public Plantacao() {
        this.especieFabrica = new EspecieFabrica();
    }

    public void addArvore(int x, int y, String nome, String cor, float alturaMaxima) {
        var especie = this.especieFabrica.getEspecie(nome,cor, alturaMaxima);
        var arvore = new Arvore(x, y, especie);
        this.arvores.add(arvore);
    }

    public List<Map<String, String>> retornaEspecies() {
        return this.especieFabrica
                .retornaTodasEspecies()
                .stream()
                .map(EspecieFlyweight::retornaEspecie)
                .toList();
    }

    public List<Map<String, String>> retornaArvores() {
        return this.arvores
                .stream()
                .map(Arvore::retornaArvore)
                .toList();
    }
}
