package br.com.cleonildo;

import br.com.cleonildo.thirdparty.TopPagamentos;

import java.math.BigDecimal;

public class AdapterMain {

    public static void main(String[] args) {
        // Criação do adaptador de PagFacil (simulado)
        PagFacilAdapter pagFacilAdapter = new PagFacilAdapter();

        // Criação de uma instância da classe TopPagamentos.
        TopPagamentos topPagamentos = new TopPagamentos();
        // Criação do adaptador de TopPagamentos.
        TopPagamentosAdapter topPagamentosAdapter = new TopPagamentosAdapter(topPagamentos);

        // Cobrança utilizando PagFacil como Gateway
        System.out.println("Cobrança utilizando PagFacil como Gateway");
        Cobranca cobranca1 = new Cobranca(pagFacilAdapter);
        cobranca1.setValor(BigDecimal.valueOf(100));
        cobranca1.setParcelas(3);
        cobranca1.setNumeroCartao("1234123412341234L");
        cobranca1.setCvv("123");
        if (cobranca1.realizarPagamento()) {
            System.out.println("Pagamento Realizado com sucesso");
        } else {
            System.out.println("O pagamento falhou");
        }

        // Cobrança utilizando TopPagamentos como Gateway
        System.out.println("\nCobrança utilizando TopPagamentos como Gateway");
        // Troca do Gateway de Cobrança para TopPagamentos
        cobranca1.setGateway(topPagamentosAdapter);
        cobranca1.setValor(BigDecimal.valueOf(100));
        cobranca1.setParcelas(3);
        cobranca1.setNumeroCartao("1234123412341234L");
        cobranca1.setCvv("123");
        if (cobranca1.realizarPagamento()) {
            System.out.println("Pagamento Realizado com sucesso");
        } else {
            System.out.println("O pagamento falhou");
        }
    }
}
