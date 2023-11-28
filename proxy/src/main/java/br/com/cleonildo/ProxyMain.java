package br.com.cleonildo;

public class ProxyMain {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("João da Silva", "11122233344", 25);

        System.out.println(usuario.getNome());

        if (usuario.verificarMaioridade()) {
            System.out.println("O usuário é maior de idade");
        } else {
            System.out.println("O usuário não é maior de idade");
        }
    }
}
