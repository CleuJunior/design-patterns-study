package com.br.study.patterns.creational.abstractfactory.caixa;

import com.br.study.patterns.creational.abstractfactory.CalculosFactory;
import com.br.study.patterns.creational.abstractfactory.Desconto;
import com.br.study.patterns.creational.abstractfactory.Juros;
import com.br.study.patterns.creational.abstractfactory.Multa;
import com.br.study.patterns.creational.abstractfactory.bancodobrasil.BBDesconto;
import com.br.study.patterns.creational.abstractfactory.bancodobrasil.BBJuros;
import com.br.study.patterns.creational.abstractfactory.bancodobrasil.BBMulta;

public class CaixaCalculosFactory implements CalculosFactory {
    @Override
    public Juros criarJuros() {
        return new CaixaJuros();
    }

    @Override
    public Desconto criarDesconto() {
        return new CaixaDesconto();
    }

    @Override
    public Multa criarMulta() {
        return new CaixaMulta();
    }
}
