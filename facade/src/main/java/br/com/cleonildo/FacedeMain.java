package br.com.cleonildo;

public class FacedeMain {

    public static void main(String[] args) {
        // Criação do consumidor.
        Consumidor consumidor = new Consumidor("Luiz da Silva", "12345678910", "luiz@email.com");

        // Criação de produtos.
        Produto produto1 = new Produto("Blusa Rosa", "Blusa feminina rosa", 80.99f);
        Produto produto2 = new Produto("Camiseta Preta", "Camiseta masculina preta", 49.90f);
        Produto produto3 = new Produto("Calça Jeans", "Calça Jeans Masculina", 119.90f);

        // ==== Até aqui apenas criamos os objetos básicos que uma venda precisa. ====

        // ==== Agora vamos ao processo de venda propriamente dito. ====

        // Criação da classe VendaFacade.
        VendaFacade vendaFacade = new VendaFacade(consumidor);

        // Adição dos produtos ao pedido.
        vendaFacade.addProduto(produto1);
        vendaFacade.addProduto(produto2);
        vendaFacade.addProduto(produto3);

        // Pagamento com boleto.
        vendaFacade.pedidoBoleto();
    }
}
