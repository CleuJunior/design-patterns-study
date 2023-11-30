package br.com.cleonildo.caixa;

import br.com.cleonildo.CalculosFactory;
import br.com.cleonildo.Desconto;
import br.com.cleonildo.Juros;
import br.com.cleonildo.Multa;

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
