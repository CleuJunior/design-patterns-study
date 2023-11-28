package br.com.cleonildo;

public class Usuario {
    private final String nome;
    private final String cpf;
    private final int idade;

    // Agora, em vez da classe concreta PessoaFisicaReceitaFederal, a interface é esperada.
    private final ReceitaFederalInterface pessoaFisica;

    public Usuario(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        /* A classe PessoaFisicaReceitaFederalProxy é instanciada no lugar da classe
           PessoaFisicaReceitaFederal.
           A classe PessoaFisicaReceitaFederalProxy não instancia a classe
           PessoaFisicaReceitaFederal em seu construtor, portanto, a instanciação da classe
           PessoaFisicaReceitaFederal é evitada até que ela seja realmente necessária. */
        this.pessoaFisica = new PessoaFisicaReceitaFederalProxy(cpf);
    }
    // Nada muda no restante da implementação.

    // Compara o nome informado pelo usuário com o nome na Receita Federal (RF).
    public boolean validarNome() {
        return this.nome.equals(this.pessoaFisica.getNome());
    }

    // Verifica se o CPF se encontra ativo na RF.
    public boolean verificaCPFAtivo() {
        return this.pessoaFisica.CPFAtivo();
    }

    // Verifica se a idade é maior ou igual a 18 anos e compara com a idade na RF.
    public boolean verificarMaioridade() {
        return this.idade >= 18 && this.idade == this.pessoaFisica.getIdade();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public ReceitaFederalInterface getPessoaFisica() {
        return pessoaFisica;
    }
}

