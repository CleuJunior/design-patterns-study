package br.com.cleonildo;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    private final List<MementoInterface> historico = new ArrayList<>();

    /* Agora o $originador a ser salvo é recebido por parâmetro.
    A classe Historico não precisa mais de uma referência permanente a ele.
    Qualquer Orginador é aceito, desde que implemente a interface OriginadorInterface */
    public void criarCheckPoint(OriginadorInterface originador) {
        historico.add(originador.salvar());
    }

    // Restaura o Originador a parte do memento no topo da pilha (array) historico.
    public void desfazer() {
        // Se o array historico não estiver vazio.
        if (historico.isEmpty()) {
            return;
        }
        // Remova o memento do topo da pilha historico e o restaure.
        MementoInterface memento = historico.remove(historico.size() - 1);
        /* Anteriormente a restauração era feita pelo TextBox (originador)
        Agora ela é feita pelo Memento */
        memento.restaurar();
    }

    // Apenas imprime o TextBox no navegador.
    public void imprimir(OriginadorInterface originador) {
        originador.imprimir();
    }
}
