package com.br.study.patterns.creational.builder;

public class BuilderA3 implements IBuilderPDFGenerator{
    private final PDFGenerator pdf;

    public BuilderA3() {
        this.pdf = new PDFGenerator();
    }

    @Override
    public PDFGenerator getPDFGenerator() {
        return this.pdf;
    }

    @Override
    public void setPageConfiguration() {
        this.pdf.setPageOrientation("portrait");
        this.pdf.setUnit("mm");
        this.pdf.setPageSizeX(297);
        this.pdf.setPageSizeY(420);
        this.pdf.setPageColor("#FFFFFF");
        this.pdf.setEncoder("#UTF-8");
    }

    @Override
    public void setMargin() {
        this.pdf.setMarginTop(60);
        this.pdf.setMarginBottom(60);
        this.pdf.setMarginRight(40);
        this.pdf.setMarginLeft(40);
    }

    @Override
    public void setHeader() {
        this.pdf.setHasHeader(false);
        this.pdf.setHeaderHeight(0);
    }

    @Override
    public void setFooter() {
        this.pdf.setHasFooter(false);
        this.pdf.setFooterHeight(0);
    }
}
