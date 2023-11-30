package br.com.cleonildo;

public class Main {
    public static void main(String[] args) {
        // ==== Criação de uma Pizza ====
        Pizza pizzaQueijo = new PizzaQueijo();
        // Impressão de sua descrição
        System.out.println("Descrição: " + pizzaQueijo.getDescricao());
        // Impressão de seu preço
        System.out.println("Preço: R$" + pizzaQueijo.getPreco());

        // ==== Adição borda de requeijão a pizza ====
        System.out.println("\nAdição de borda de requeijão");
        // Um decorator é criado e passa a englobar a pizza
        Pizza pizzaQueijoBorda = new BordaRequeijao(pizzaQueijo);
        // Impressão da descrição do decorator + pizza
        System.out.println("Descrição: " + pizzaQueijoBorda.getDescricao());
        // Impressão do preço do decorator + pizza
        System.out.println("Preço: R$" + pizzaQueijoBorda.getPreco());

        // ==== Adição massa integral a pizza ====
        System.out.println("\nAdição de massa integral");
        // Mais um decorator é criado e passa a englobar o primeiro decorator e a pizza
        Pizza pizzaQueijoBordaMassaIntegral = new MassaIntegral(pizzaQueijoBorda);
        // Impressão da descrição do primeiro decorator + segundo decorator + pizza
        System.out.println("Descrição: " + pizzaQueijoBordaMassaIntegral.getDescricao());
        // Impressão do preço do primeiro decorator + segundo decorator + pizza
        System.out.println("Preço: R$" + pizzaQueijoBordaMassaIntegral.getPreco());
    }
}
