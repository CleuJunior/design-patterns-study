package com.br.study.patterns.structural.proxy;

public class PessoaFisicaReceitaFederalProxy implements IReceitaFederal{
    private String cpf;
    private IReceitaFederal receitaFederal = null;

    public PessoaFisicaReceitaFederalProxy(String cpf) {
        this.cpf = cpf;
    }

    private void createPeeosaFisicaFederal() {
        if (receitaFederal == null) {
            this.receitaFederal = new PessoaFisicaReceitaFederal(this.cpf);
        }
    }

    @Override
    public String getName() {
        this.createPeeosaFisicaFederal();
        return this.receitaFederal.getName();
    }

    @Override
    public int getAge() {
        this.createPeeosaFisicaFederal();
        return this.receitaFederal.getAge();
    }

    @Override
    public boolean CPFActive() {
        this.createPeeosaFisicaFederal();
        return this.receitaFederal.CPFActive();
    }
}
