package br.com.cleonildo;

public class PessoaFisicaReceitaFederalProxy implements ReceitaFederalInterface {
    private final String cpf;
    // A referência à classe PessoaFisicaReceitaFederal é inicializada como null.
    private ReceitaFederalInterface pessoaFisicaRF = null;

    public PessoaFisicaReceitaFederalProxy(String cpf) {
        // No construtor do Proxy, apenas o valor do CPF é armazenado.
        this.cpf = cpf;
        // Não há instanciação da classe PessoaFisicaReceitaFederal aqui.
    }

    // Quando a classe PessoaFisicaReceitaFederal for realmente necessária,
    // este método será responsável por sua criação.
    private void criarPessoaFisicaReceitaFederal() {
        // Primeiro, verifica se a classe ainda não foi instanciada.
        // Como sua criação é custosa e não mudará neste contexto,
        // é melhor instanciá-la apenas uma vez.
        if (this.pessoaFisicaRF == null) {
            this.pessoaFisicaRF = new PessoaFisicaReceitaFederal(this.cpf);
        }
    }

    // Solicita a instanciação da classe PessoaFisicaReceitaFederal e delega a ela
    // a responsabilidade de recuperar o nome do usuário.
    @Override
    public String getNome() {
        criarPessoaFisicaReceitaFederal();
        return this.pessoaFisicaRF.getNome();
    }

    // Solicita a instanciação da classe PessoaFisicaReceitaFederal e delega a ela
    // a responsabilidade de recuperar a idade do usuário.
    @Override
    public int getIdade() {
        criarPessoaFisicaReceitaFederal();
        return this.pessoaFisicaRF.getIdade();
    }

    // Solicita a instanciação da classe PessoaFisicaReceitaFederal e delega a ela
    // a responsabilidade de verificar se o CPF do usuário está ativo.
    @Override
    public boolean CPFAtivo() {
        criarPessoaFisicaReceitaFederal();
        return this.pessoaFisicaRF.CPFAtivo();
    }
}

