package com.br.study.patterns.structural.proxy;

public class PessoaFisicaReceitaFederal implements IReceitaFederal {
    private String name;
    private String cpf;
    private int age;
    private boolean cpfActive;

    public PessoaFisicaReceitaFederal(String cpf) {
        this.cpf = cpf;
        this.name = "Joao da Silva";
        this.age = 25;
        this.cpfActive = true;

        try {
            Thread.sleep(5000);
            System.out.println("PessoaFisicaReceitaFederal successfully created");
        } catch (InterruptedException e) {
            System.out.println("Error!");
        }
    }

    @Override
    public String getName() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error!");
        }

        return name;
    }

    @Override
    public int getAge() {
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            System.out.println("Error!");
        }
        return age;
    }

    @Override
    public boolean CPFActive(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public boolean isCpfActive() throws InterruptedException {
        Thread.sleep(2000);
        return cpfActive;
    }
}
