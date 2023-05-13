package com.br.study.patterns.creational.builder;

public interface IBuilderPDFGenerator {

    PDFGenerator getPDFGenerator();
    void setPageConfiguration();
    void setMargin();
    void setHeader();
    void setFooter();
}
