package br.com.cleonildo;

public class ImpressoraDeAgregados {
    private Agregado<Integer> agregado;

    // Define um agregado ao cliente em tempo de execução.
    public void setAgregado(Agregado<Integer> agregado) {
        this.agregado = agregado;
    }

    public void iterar() {
        // Cria o iterador do agregado.
        PIterator<Integer> iterator = this.agregado.createIterator();

        // Enquanto existir um próximo elemento.
        while (iterator.hasNext()) {
            // Imprima o elemento concatenado a um espaço em branco.
            System.out.print(iterator.next() + " ");
        }
    }
}

