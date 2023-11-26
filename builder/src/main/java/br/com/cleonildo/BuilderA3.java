package br.com.cleonildo;

public class BuilderA3 implements BuilderInterfaceGeradorPDF {
    private final GeradorPDF geradorPDF;

    // Agora o construtor cria o objeto mas não o configura.
    public BuilderA3() {
        this.geradorPDF = new GeradorPDF();
    }

    // Retorna o Objeto.
    public GeradorPDF getGeradorPDF() {
        return this.geradorPDF;
    }

    // Define as configurações das páginas conforme A3;
    public void setPageConfiguration() {
        this.geradorPDF.setPageOrientation("portrait");
        this.geradorPDF.setUnit("mm");
        this.geradorPDF.setPageSizeX(297);
        this.geradorPDF.setPageSizeY(420);
        this.geradorPDF.setPageColor("#ffffff");
        this.geradorPDF.setEncode("UTF-8");
    }

    // Configura as margens das páginas conforme A3;
    public void setMargim() {
        this.geradorPDF.setMarginTop(60);
        this.geradorPDF.setMarginRight(40);
        this.geradorPDF.setMarginBottom(60);
        this.geradorPDF.setMarginLeft(40);
    }

    // Configura o cabeçalho das páginas conforme A3;
    public void setHeader() {
        this.geradorPDF.setHasHeader(false);
        this.geradorPDF.setHeaderHeight(0);
    }

    // Configura o rodapé das páginas conforme A3;
    public void setFooter() {
        this.geradorPDF.setHasFooter(false);
        this.geradorPDF.setFooterHeight(0);
    }
}

