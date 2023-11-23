package com.br.study.patterns.structural.composite;

public class Arquivo extends Component{

    public String nome;
    public String camnhio;

    public Arquivo(String nome, String camnhio) {
        this.nome = nome;
        this.camnhio = camnhio;
    }

    public String getNome() {
        return nome;
    }

    public String getCamnhio() {
        return camnhio;
    }

    public void exibir() {
        System.out.println(" - " + this.getNome() + " - [" + this.getCamnhio() + "]");
    }
}
