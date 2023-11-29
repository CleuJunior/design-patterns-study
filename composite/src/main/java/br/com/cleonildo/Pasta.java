package br.com.cleonildo;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends Component {

    public String nome;
    public String camnhio;
    public final List<Component> componentes = new ArrayList<>();

    public Pasta(String nome, String camnhio) {
        this.nome = nome;
        this.camnhio = camnhio;
    }

    public void adicionar(Component componente) {
        this.componentes.add(componente);
    }

    public void remover(Component componente) {
        this.componentes.removeIf(arquivo -> arquivo.equals(componente));
    }

    public Component recuperarFilho(int index) {
        return this.componentes.get(index);
    }

    public String getNome() {
        return nome;
    }

    public String getCamnhio() {
        return camnhio;
    }

    public void exibir() {
        System.out.println("## " + this.getNome() + " - [" + this.getCamnhio() + "] ##");
        System.out.println("-----------------------------------------------------------");
        this.componentes.forEach(Component::exibir);
        System.out.println();
    }
}
