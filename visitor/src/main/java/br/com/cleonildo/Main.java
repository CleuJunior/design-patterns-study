package br.com.cleonildo;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado("Supermercado Esquina");
        Departamento departamento1 = new Departamento("Alimentação Básica");

        Produto arroz = new Produto("Arroz 5Kg", new BigDecimal(18), new BigDecimal(30));
        Produto macarrao = new Produto("Macarrão", new BigDecimal("3.20"), new BigDecimal(15));

        departamento1.addProduto(arroz);
        departamento1.addProduto(macarrao);

        Departamento departamento2 = new Departamento("Higiene");

        Produto papelHigienico = new Produto("Papel Higiênico", new BigDecimal(11), new BigDecimal(35));
        Produto sabonete = new Produto("Sabonete", new BigDecimal("1.20"), new BigDecimal(10));

        departamento2.addProduto(papelHigienico);
        departamento2.addProduto(sabonete);

        supermercado.addDepartamento(departamento1);
        supermercado.addDepartamento(departamento2);

        Lucratividade visitorLucratividade = new Lucratividade();

        BigDecimal lucratividadeSupermercado = supermercado.aceitar(visitorLucratividade);
        System.out.println("Lucratividade Supermercado: R$ " + lucratividadeSupermercado);

        BigDecimal lucratividadeDepartamento1 = departamento1.aceitar(visitorLucratividade);
        System.out.println("Lucratividade Departamento 1: R$ " + lucratividadeDepartamento1);

        BigDecimal lucratividadeArroz = arroz.aceitar(visitorLucratividade);
        System.out.println("Lucratividade Arroz: R$ " + lucratividadeArroz);

        BigDecimal lucratividadeMacarrao = macarrao.aceitar(visitorLucratividade);
        System.out.println("Lucratividade Macarrão: R$ " + lucratividadeMacarrao);

        BigDecimal lucratividadeDepartamento2 = departamento2.aceitar(visitorLucratividade);
        System.out.println("Lucratividade Departamento 2: R$ " + lucratividadeDepartamento2);

        BigDecimal lucratividadePapelHigienico = papelHigienico.aceitar(visitorLucratividade);
        System.out.println("Lucratividade Papel Higiênico: R$ " + lucratividadePapelHigienico);

        BigDecimal lucratividadeSabonete = sabonete.aceitar(visitorLucratividade);
        System.out.println("Lucratividade Sabonete: R$ " + lucratividadeSabonete);
    }
}
