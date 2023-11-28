package br.com.cleonildo;

public class PessoaFisicaReceitaFederal implements ReceitaFederalInterface {

    private final String nome;
    private String cpf;
    private final int idade;
    private final boolean cpfAtivo;

    public PessoaFisicaReceitaFederal(String cpf) {
        this.cpf = cpf;
        this.nome = "João da Silva"; // Simulação de dado encontrado com base no CPF
        this.idade = 25; // Simulação de dado encontrado com base no CPF
        this.cpfAtivo = true; // Simulação de dado encontrado com base no CPF
        try {
            Thread.sleep(5000); // Simulação do tempo de resposta da requisição à API.
            System.out.println("PessoaFisicaReceitaFederal criada com sucesso");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getNome() {
        try {
            Thread.sleep(2000); // Simulação do tempo de resposta da requisição à API.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.nome;
    }

    @Override
    public int getIdade() {
        try {
            Thread.sleep(2000); // Simulação do tempo de resposta da requisição à API.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.idade;
    }

    @Override
    public boolean CPFAtivo() {
        try {
            Thread.sleep(3000); // Simulação do tempo de resposta da requisição à API.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.cpfAtivo;
    }


}
