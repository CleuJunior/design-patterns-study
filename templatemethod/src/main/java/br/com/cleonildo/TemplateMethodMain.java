package br.com.cleonildo;

import br.com.cleonildo.gateway.Gateway;
import br.com.cleonildo.payment.PagamentoCredito;
import br.com.cleonildo.payment.PagamentoDebito;
import br.com.cleonildo.payment.PagamentoDinheiro;

public class TemplateMethodMain {
    public static void main(String[] args) {
        double valor = 1000; // Definição do valor do pagamento.
        Gateway gateway = new Gateway(); // Criação de uma instância de Gateway.

        // Pagamento Crédito.
        System.out.print("Crédito: ");
        PagamentoCredito pagamentoCredito = new PagamentoCredito(valor, gateway);
        System.out.println(pagamentoCredito.realizaCobranca());

        // Pagamento Débito.
        System.out.print("Débito: ");
        PagamentoDebito pagamentoDebito = new PagamentoDebito(valor, gateway);
        System.out.println(pagamentoDebito.realizaCobranca());

        // Pagamento Dinheiro.
        System.out.print("Dinheiro: ");
        PagamentoDinheiro pagamentoDinheiro = new PagamentoDinheiro(valor, gateway);
        System.out.println(pagamentoDinheiro.realizaCobranca());
    }
}
