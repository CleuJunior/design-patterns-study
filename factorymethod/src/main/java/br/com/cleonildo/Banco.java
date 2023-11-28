package br.com.cleonildo;

public abstract class Banco {
    public Boleto gerarBoleto(int vencimentoBoleto, float valor) {
        // Chama o método criarBoleto() que é abstrato, portanto será implementado apenas
        // pelas subclasses de Banco.
        Boleto boleto = criarBoleto(vencimentoBoleto, valor);
        System.out.println("Boleto gerado com sucesso no valor de R$ " + valor);
        System.out.println("Valor Juros: R$" + boleto.calcularJuros());
        System.out.println("Valor Desconto: R$" + boleto.calcularDesconto());
        System.out.println("Valor Multa: R$" + boleto.calcularMulta());
        System.out.println("---------------\n\n");
        return boleto;
    }

    // Cada subclasse implementa o método criarBoleto criando seus respectivos objetos.
    protected abstract Boleto criarBoleto(int vencimentoBoleto, float valor);
}

