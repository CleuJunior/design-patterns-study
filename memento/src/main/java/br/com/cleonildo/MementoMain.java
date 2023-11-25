package br.com.cleonildo;

public class MementoMain {
    public static void main(String[] args) {
        // Criação de um TextBox com posição x=20 e y=100.
        TextBox textBox = new TextBox(20, 100);

        // Criação de um histórico, agora sem passar o $textBox como parâmetro.
        Historico historico = new Historico();

        // Edição de alguns valores de textBox.
        textBox.setText("Teste de caixa de texto."); // Inserção de um texto.
        textBox.setFontWeight("bold"); // bold indica que o texto deve estar em negrito.
        textBox.setFontFamily("Cursive"); // Cursive é o nome da fonte a ser utilizada.
        textBox.setFontSize(25); // A fonte deve ter um tamanho de 25px.

        // Salvamento do estado atual de $textBox. Agora recebe o $textBox por parâmetro.
        historico.criarCheckPoint(textBox); // Um memento foi empilhado no historico.

        // Edição de alguns valores de textBox.
        textBox.setText("Teste de caixa de texto editado."); // Mudança no texto.
        textBox.setFontWeight("normal"); // Normal indica que o texto não deve estar em negrito.
        textBox.setFontFamily("monospace"); // monospace é o nome da fonte a ser utilizada.
        textBox.setFontSize(15); // A fonte deve ter um tamanho de 15px.
        textBox.setPosition(40, 110); // A posição x deve ser 40 e y deve ser 110;

        // Salvamento do estado atual de $textBox. Recebendo o $textBox por parâmetro.
        historico.criarCheckPoint(textBox); // Mais um memento foi empilhado no historico.

        // Edição de alguns valores de textBox.
        textBox.setFontFamily("fantasy"); // fantasy é o nome da fonte a ser utilizada.
        textBox.setFontSize(12); // A fonte deve ter um tamanho de 12px.
        textBox.setPosition(60, 120); // A posição x deve ser 60 e y deve ser 120;

        textBox.imprimir(); // Imprime o estado atual do textBox.
        historico.desfazer(); // Restaura o textBox ao último estado salvo.
        textBox.imprimir(); // Imprime o estado atual do textBox.
        historico.desfazer(); // Restaura o textBox ao penúltimo estado salvo.
        textBox.imprimir(); // Imprime o estado atual do textBox.
    }
}
