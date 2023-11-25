package br.com.cleonildo;

public class TextBox implements OriginadorInterface {
    private int x;
    private int y;
    private String text;
    private String fontFamily;
    private int fontSize;
    private String textAlign;
    private String fontWeight;

    public TextBox(int x, int y) {
        this.x = x;
        this.y = y;
        this.text = "";
        this.fontFamily = "Arial";
        this.fontSize = 14;
        this.textAlign = "left";
        this.fontWeight = "normal";
    }

    public void imprimir() {
        System.out.printf("<div style='margin-left: %dpx; margin-top: %dpx;'>%n", this.x, this.y);
        System.out.printf("<span style='font-size: %dpx; font-family: %s; font-weight: %s;'>%s</span>%n",
                this.fontSize, this.fontFamily, this.fontWeight, this.text);
        System.out.println("</div>");
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public void setTextAlign(String textAlign) {
        this.textAlign = textAlign;
    }

    public void setFontWeight(String fontWeight) {
        this.fontWeight = fontWeight;
    }

    public MementoInterface salvar() {
        return new TextBoxMemento(
                this, // Agora a classe também se passa como parâmetro para o MementoConcreto.
                this.x,
                this.y,
                this.text,
                this.fontFamily,
                this.fontSize,
                this.textAlign,
                this.fontWeight
        );
    }
}

