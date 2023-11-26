package br.com.cleonildo;

public class GeradorPDFDirector {
    private BuilderInterfaceGeradorPDF builderGeradorPDF;

    // Guarda referência a um objeto do tipo BuilderInterfaceGeradorPDF.
    public GeradorPDFDirector(BuilderInterfaceGeradorPDF builderGeradorPDF) {
        this.builderGeradorPDF = builderGeradorPDF;
    }

    // Muda o Builder em tempo de execução.
    public void setBuilderGeradorPDF(BuilderInterfaceGeradorPDF builderGeradorPDF) {
        this.builderGeradorPDF = builderGeradorPDF;
    }

    // Configura completamente o objeto criado pelo Builder recebido no construtor.
    public void criarGeradorPDF() {
        builderGeradorPDF.setPageConfiguration();
        builderGeradorPDF.setMargim();
        builderGeradorPDF.setHeader();
        builderGeradorPDF.setFooter();
    }

    // Configura o objeto criado pelo Builder recebido no construtor sem cabeçalho.
    public void criarGeradorPDFNoHeader() {
        builderGeradorPDF.setPageConfiguration();
        builderGeradorPDF.setMargim();
        builderGeradorPDF.setFooter();
    }

    // Configura o objeto criado pelo Builder recebido no construtor sem cabeçalho e rodapé.
    public void criarGeradorPDFNoHeaderNoFooter() {
        builderGeradorPDF.setPageConfiguration();
        builderGeradorPDF.setMargim();
    }
}

