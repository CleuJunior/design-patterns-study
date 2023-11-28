package br.com.cleonildo;

import br.com.cleonildo.bb.BancoDoBrasil;
import br.com.cleonildo.caixa.BancoCaixa;

public class FactoryMethodMain {
    public static void main(String[] args) {
        System.out.println("######### Caixa #########"); // Apenas imprime um separador no console.

        //Criação da Simple Factory.
        BoletoSimpleFactory boletoSimpleFactory = new BoletoSimpleFactory();

        // Criação de uma instância de BancoCaixa. Boletos gerados serão da Caixa.
        BancoCaixa bancoCaixa = new BancoCaixa(boletoSimpleFactory);

        // Gera um BancoCaixaBoleto10Dias.
        bancoCaixa.gerarBoleto(10, 100);

        // Gera um BancoCaixaBoleto30Dias.
        bancoCaixa.gerarBoleto(30, 100);

        // Gera um BancoCaixaBoleto60Dias.
        bancoCaixa.gerarBoleto(60, 100);

        System.out.println("######### Banco do Brasil #########"); // Apenas imprime um separador no console.

        // Criação de uma instância de BancoDoBrasil. Boletos gerados serão do Banco do Brasil.
        BancoDoBrasil bancoDoBrasil = new BancoDoBrasil();

        // Gera um BancoDoBrasilBoleto10Dias.
        bancoDoBrasil.gerarBoleto(10, 100);

        // Gera um BancoDoBrasilBoleto30Dias.
        bancoDoBrasil.gerarBoleto(30, 100);

        // Gera um BancoDoBrasilBoleto60Dias.
        bancoDoBrasil.gerarBoleto(60, 100);
    }
}
