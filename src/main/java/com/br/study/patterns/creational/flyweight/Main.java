package com.br.study.patterns.creational.flyweight;

import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var plantacao = new Plantacao();

        for (int i = 0; i < 10; i++) {
            plantacao.addArvore(new Random().nextInt(0, 500), new Random().nextInt(0, 500), "Ipê",  "#2caf1e", 10);
            plantacao.addArvore(new Random().nextInt(0, 500), new Random().nextInt(0, 500), "Palmeira",  "#008a29", 7);
            plantacao.addArvore(new Random().nextInt(0, 500), new Random().nextInt(0, 500), "Jabuticabeira",  "#00b626", 5);
        }

        System.out.println(plantacao.retornaEspecies());
        System.out.println("___________________________________");

        for (Map<String, String> arvore: plantacao.retornaArvores()) {
            System.out.println(arvore);
            System.out.println("___________________________________");
        }

    }
}
