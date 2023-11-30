package br.com.cleonildo.bancodobrasil;


import br.com.cleonildo.CalculosFactory;
import br.com.cleonildo.Desconto;
import br.com.cleonildo.Juros;
import br.com.cleonildo.Multa;

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
