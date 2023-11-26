package br.com.cleonildo;

public class BuilderA4 implements BuilderInterfaceGeradorPDF {
    private final GeradorPDF geradorPDF;

    // Agora o construtor cria o objeto mas não o configura.
    public BuilderA4() {
        this.geradorPDF = new GeradorPDF();
    }

    // Retorna o Objeto.
    public GeradorPDF getGeradorPDF() {
        return this.geradorPDF;
    }

    // Define as configurações das páginas conforme A4;
    public void setPageConfiguration() {
        this.geradorPDF.setPageOrientation("portrait");
        this.geradorPDF.setUnit("mm");
        this.geradorPDF.setPageSizeX(210);
        this.geradorPDF.setPageSizeY(297);
        this.geradorPDF.setPageColor("#ffffff");
        this.geradorPDF.setEncode("UTF-8");
    }

    // Configura as margens das páginas conforme A4;
    public void setMargim() {
        this.geradorPDF.setMarginTop(30);
        this.geradorPDF.setMarginRight(20);
        this.geradorPDF.setMarginBottom(30);
        this.geradorPDF.setMarginLeft(20);
    }

    // Configura o cabeçalho das páginas conforme A4;
    public void setHeader() {
        this.geradorPDF.setHasHeader(true);
        this.geradorPDF.setHeaderHeight(15);
    }

    // Configura o rodapé das páginas conforme A4;
    public void setFooter() {
        this.geradorPDF.setHasFooter(true);
        this.geradorPDF.setFooterHeight(15);
    }
}
