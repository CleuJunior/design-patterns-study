package com.br.study.patterns.creational.abstractfactory.bancodobrasil;

import com.br.study.patterns.creational.abstractfactory.CalculosFactory;
import com.br.study.patterns.creational.abstractfactory.Desconto;
import com.br.study.patterns.creational.abstractfactory.Juros;
import com.br.study.patterns.creational.abstractfactory.Multa;

public class BBCalculosFactory implements CalculosFactory {
    @Override
    public Juros criarJuros() {
        return new BBJuros();
    }

    @Override
    public Desconto criarDesconto() {
        return new BBDesconto();
    }

    @Override
    public Multa criarMulta() {
        return new BBMulta();
    }
}
