package com.br.study.patterns.behavioral.visitor;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        var supermercado = new Supermercado("Supermercado Esquina");
        var departamento1 = new Departamento("Alimentação Básica");

        var arroz = new Produto("Arroz 5Kg", new BigDecimal(18), new BigDecimal(30));
        var macarrao = new Produto("Macarrão", new BigDecimal("3.20"), new BigDecimal(15));

        departamento1.addProduto(arroz);
        departamento1.addProduto(macarrao);

        var departamento2 = new Departamento("Higiene");

        var papelHigienico = new Produto("Papel Higiênico", new BigDecimal(11), new BigDecimal(35));
        var sabonete = new Produto("Sabonete", new BigDecimal("1.20"), new BigDecimal(10));

        departamento2.addProduto(papelHigienico);
        departamento2.addProduto(sabonete);

        supermercado.addDepartamento(departamento1);
        supermercado.addDepartamento(departamento2);

        var visitorLucratividade = new Lucratividade();

        var lucratividadeSupermercado = supermercado.aceitar(visitorLucratividade);
        System.out.println("Lucratividade Supermercado: R$ " + lucratividadeSupermercado);

        var lucratividadeDepartamento1 = departamento1.aceitar(visitorLucratividade);
        System.out.println("Lucratividade Departamento 1: R$ " + lucratividadeDepartamento1);

        var lucratividadeArroz = arroz.aceitar(visitorLucratividade);
        System.out.println("Lucratividade Arroz: R$ " + lucratividadeArroz);

        var lucratividadeMacarrao = macarrao.aceitar(visitorLucratividade);
        System.out.println("Lucratividade Macarrão: R$ " + lucratividadeMacarrao);

        var lucratividadeDepartamento2 = departamento2.aceitar(visitorLucratividade);
        System.out.println("Lucratividade Departamento 2: R$ " + lucratividadeDepartamento2);

        var lucratividadePapelHigienico = papelHigienico.aceitar(visitorLucratividade);
        System.out.println("Lucratividade Papel Higiênico: R$ " + lucratividadePapelHigienico);

        var lucratividadeSabonete = sabonete.aceitar(visitorLucratividade);
        System.out.println("Lucratividade Sabonete: R$ " + lucratividadeSabonete);
    }
}
