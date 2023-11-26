package br.com.cleonildo;

public class BuilderMain {
    public static void main( String[] args ) {
        System.out.println("## Criação do objeto A4 ##");
        // Criação do Builder de A4.
        BuilderInterfaceGeradorPDF builderA4 = new BuilderA4();
        // Criação do Diretor passando para ele o Builder de A4.
        GeradorPDFDirector director = new GeradorPDFDirector(builderA4);
        // Criação de um objeto totalmente configurado.
        director.criarGeradorPDF();
        // Recuperação do Objeto.
        GeradorPDF pdfA4 = builderA4.getGeradorPDF();
        // Impressão do Objeto.
        System.out.println(pdfA4);
        System.out.println();

        System.out.println("## Criação do objeto A3 ##");
        // Criação do Builder de A3.
        BuilderInterfaceGeradorPDF builderA3 = new BuilderA3();
        // ATUALIZAÇÃO do diretor passando para ele o Builder de A3. O diretor não foi criado novamente.
        director.setBuilderGeradorPDF(builderA3);
        // Criação de um objeto totalmente configurado.
        director.criarGeradorPDF();
        // Recuperação do Objeto.
        GeradorPDF pdfA3 = builderA3.getGeradorPDF();
        // Impressão do Objeto.
        System.out.println(pdfA3);
        System.out.println();


        System.out.println("## Criação do objeto A4 ##");
        // Criação do Builder de A4.
        BuilderInterfaceGeradorPDF builderA4_2 = new BuilderA4();
        // Criação do Diretor passando para ele o Builder de A4.
        GeradorPDFDirector director_2 = new GeradorPDFDirector(builderA4_2);
        // Criação de um objeto sem o Header.
        director_2.criarGeradorPDFNoHeader();
        // Recuperação do Objeto.
        GeradorPDF pdfA4_2 = builderA4_2.getGeradorPDF();
        // Impressão do Objeto.
        System.out.println(pdfA4_2);
    }
}
