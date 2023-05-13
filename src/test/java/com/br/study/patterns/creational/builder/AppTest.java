package com.br.study.patterns.creational.builder;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void shouldReturnCorrectPropertiesWhenCallingCreatePDFGenerator() {
        BuilderA4 b4 = new BuilderA4();
        DirectorPDFGenerator director =  new DirectorPDFGenerator(b4);
        director.createPDFGenerator();
        PDFGenerator pdf = b4.getPDFGenerator();

        final String toStringPDFB4 =
                "PDFGenerator[pageOrientation='portrait', unit='mm', pageSizeX=210, pageSizeY=297, " +
                "marginTop=30, marginBottom=30, marginRight=20, marginLeft=20, hasHeader=true, headerHeight=15, " +
                "hasFooter=false, footerHeight=15, pageColor='#FFFFFF', encoder='#UTF-8']";

        Assert.assertEquals(toStringPDFB4, pdf.toString());

        BuilderA3 b3 = new BuilderA3();
        director.setBuilderPDFGenerator(b3);
        pdf = b3.getPDFGenerator();

        final String toStringPDFB3 =
                "PDFGenerator[pageOrientation='portrait', unit='mm', pageSizeX=210, pageSizeY=297, " +
                "marginTop=30, marginBottom=30, marginRight=20, marginLeft=20, hasHeader=false, headerHeight=0, " +
                "hasFooter=false, footerHeight=0, pageColor='#FFFFFF', encoder='UTF-8']";

        Assert.assertEquals(toStringPDFB3, pdf.toString());
    }
}

