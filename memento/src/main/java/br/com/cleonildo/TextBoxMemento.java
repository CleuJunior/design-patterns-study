package br.com.cleonildo;

public class TextBoxMemento implements MementoInterface {
    private final TextBox textBox; // Mantém uma referência ao seu Originador.
    private final int x;
    private final int y;
    private final String text;
    private final String fontFamily;
    private final int fontSize;
    private final String textAlign;
    private final String fontWeight;

    public TextBoxMemento(
            TextBox textBox,
            int x,
            int y,
            String text,
            String fontFamily,
            int fontSize,
            String textAlign,
            String fontWeight
    ) {
        this.textBox = textBox;
        this.x = x;
        this.y = y;
        this.text = text;
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.textAlign = textAlign;
        this.fontWeight = fontWeight;
    }

    // Utiliza-se os métodos setters do Originador para restaurá-lo.
    public void restaurar() {
        textBox.setPosition(x, y);
        textBox.setText(text);
        textBox.setFontFamily(fontFamily);
        textBox.setFontSize(fontSize);
        textBox.setTextAlign(textAlign);
        textBox.setFontWeight(fontWeight);
    }
}
