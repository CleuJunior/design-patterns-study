package br.com.cleonildo;

import Shipping.Frete;
import Shipping.FreteComum;
import Shipping.FreteExpresso;
import pedido.PedidoEletronicos;
import pedido.PedidoMoveis;


public class StrategyMain
{
    public static void main(String[] args) {

        Frete freteComum = new FreteComum();
        Frete freteExpresso = new FreteExpresso();

        PedidoEletronicos pedidoEletronicos = new PedidoEletronicos();
        pedidoEletronicos.setValor(100.0);
        pedidoEletronicos.setTipoFrete(freteComum);
        System.out.println("Eletrônicos Frete Comum: R$" + pedidoEletronicos.calculaFrete());

        pedidoEletronicos.setTipoFrete(freteExpresso);
        System.out.println("Eletrônicos Frete Expresso: R$" + pedidoEletronicos.calculaFrete());

        PedidoMoveis pedidoMoveis = new PedidoMoveis();

        pedidoMoveis.setValor(100.0);
        pedidoMoveis.setTipoFrete(freteComum);
        System.out.println("Móveis Frete Comum: R$" + pedidoMoveis.calculaFrete());
    }
}