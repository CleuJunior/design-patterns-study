package br.com.cleonildo;

public interface BuilderInterfaceGeradorPDF {
    GeradorPDF getGeradorPDF();
    void setPageConfiguration();
    void setMargim();
    void setHeader();
    void setFooter();
}
