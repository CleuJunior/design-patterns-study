package com.br.study.patterns.creational.builder;

public class BuilderA4 implements IBuilderPDFGenerator{
    private final PDFGenerator pdf;

    public BuilderA4() {
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
        this.pdf.setPageSizeX(210);
        this.pdf.setPageSizeY(297);
        this.pdf.setPageColor("#FFFFFF");
        this.pdf.setEncoder("#UTF-8");
    }

    @Override
    public void setMargin() {
        this.pdf.setMarginTop(30);
        this.pdf.setMarginBottom(30);
        this.pdf.setMarginRight(20);
        this.pdf.setMarginLeft(20);
    }

    @Override
    public void setHeader() {
        this.pdf.setHasHeader(true);
        this.pdf.setFooterHeight(15);
    }

    @Override
    public void setFooter() {
        this.pdf.setHasHeader(true);
        this.pdf.setHeaderHeight(15);
    }
}
