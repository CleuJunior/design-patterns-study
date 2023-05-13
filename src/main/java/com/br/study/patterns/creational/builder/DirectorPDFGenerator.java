package com.br.study.patterns.creational.builder;

public class DirectorPDFGenerator {
    private IBuilderPDFGenerator builderPDFGenerator;

    public DirectorPDFGenerator(final IBuilderPDFGenerator builderPDFGenerator) {
        this.builderPDFGenerator = builderPDFGenerator;
    }

    public void setBuilderPDFGenerator(final IBuilderPDFGenerator builderPDFGenerator) {
        this.builderPDFGenerator = builderPDFGenerator;
    }

    public void createPDFGenerator() {
        this.builderPDFGenerator.setPageConfiguration();
        this.builderPDFGenerator.setMargin();
        this.builderPDFGenerator.setHeader();
        this.builderPDFGenerator.setFooter();
    }

    public void createPDFGeneratorNoHeader() {
        this.builderPDFGenerator.setPageConfiguration();
        this.builderPDFGenerator.setMargin();
        this.builderPDFGenerator.setFooter();
    }

    public void createPDFGeneratorNoHeaderNoFooter() {
        this.builderPDFGenerator.setPageConfiguration();
        this.builderPDFGenerator.setMargin();
    }
}
