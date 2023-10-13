package com.br.study.patterns.structural.proxy;

public class User {
    private final String name;
    private final String cpf;
    private final int age;
    private final IReceitaFederal pessoaFisicaReceitaFederal;

    public User(String name, String cpf, int age) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;
        this.pessoaFisicaReceitaFederal = new PessoaFisicaReceitaFederalProxy(this.cpf);
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public int getAge() {
        return age;
    }

    public boolean validateName() {
        return this.name.equals(this.pessoaFisicaReceitaFederal.getName());
    }

    public boolean legalAge() throws InterruptedException {
        return this.age >= 18 && this.age == this.pessoaFisicaReceitaFederal.getAge();
    }
}
