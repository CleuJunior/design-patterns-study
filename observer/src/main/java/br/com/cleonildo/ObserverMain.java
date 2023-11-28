package br.com.cleonildo;

public class ObserverMain {
    public static void main(String[] args) {
        // Criação da Newsletter (Subject);
        Newsletter newsletter = new Newsletter();

        // Criação de funcionários
        Funcionario funcionario1 = new Funcionario("Funcionario 1", "funcionario1@email.com", newsletter);
        Funcionario funcionario2 = new Funcionario("Funcionario 2", "funcionario2@email.com", newsletter);

        // Criação de clientes
        Cliente cliente = new Cliente("Cliente 1", "cliente1@email.com", newsletter);

        // Criação de parceiros
        Parceiro parceiro = new Parceiro("Parceiro 1", "parceiro1@email.com", newsletter);

        // Criação de fornecedor
        Fornecedor fornecedor = new Fornecedor("Fornecedor 1", "fornecedor1@email.com", newsletter);

        // Envio da primeira mensagem
        newsletter.addMensagem("Primeira Mensagem");
        System.out.println("######\n\n"); // Separador para facilitar a leitura da saída.

        // Remoção do Funcionário 2 da lista de objetos (observers) a serem notificados.
        newsletter.removeObserver(funcionario2);

        // Envio da segunda mensagem (Não irá para o Funcionário 2)
        newsletter.addMensagem("Segunda Mensagem");
        System.out.println("######\n\n"); // Separador para facilitar a leitura da saída.

        // O Funcionário 2 é reinserido na lista de observers.
        newsletter.registerObserver(funcionario2);

        // Envio da terceira Mensagem
        newsletter.addMensagem("Terceira Mensagem");
    }}
