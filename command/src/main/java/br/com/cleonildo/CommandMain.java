package br.com.cleonildo;

public class CommandMain {
    public static void main(String[] args) {
        // ----- Vamos criar a Lâmpada da sala -----
        Lampada lampadaSala = new Lampada("Lâmpada da Sala", false);
        // ----- Agora a Lâmpada do quarto -----
        Lampada lampadaQuarto = new Lampada("Lâmpada do Quarto", false);
        // ----- O Ar-condicionado -----
        ArCondicionado arCondicionado = new ArCondicionado("Ar-Condicionado", false, 26);
        // ----- Vamos criar o Aplicativo -----
        Aplicativo aplicativo = new Aplicativo();
        // ----- É a vez dos comando serem criados -----
        // Comando para a lâmpada da sala
        LigarLampada ligarLampadaSala = new LigarLampada(lampadaSala);
        DesligarLampada desligarLampadaSala = new DesligarLampada(lampadaSala);
        // Comando para a lâmpada do quarto
        LigarLampada ligarLampadaQuarto = new LigarLampada(lampadaQuarto);
        DesligarLampada desligarLampadaQuarto = new DesligarLampada(lampadaQuarto);
        // Comandos para o Ar-condicionado
        LigarArCondicionado ligarAr = new LigarArCondicionado(arCondicionado);
        DesligarArCondicionado desligarAr = new DesligarArCondicionado(arCondicionado);
        MudarTemperaturaArCondicionado mudarTemperaturaAr = new MudarTemperaturaArCondicionado(arCondicionado);
        // ----- Vamos armazenar os comandos no aplicativo -----
        // Os ids recebem o índice em que o comando foi adicionado ao aplicativo.
        int idLigarLampadaSala = aplicativo.setComando(ligarLampadaSala);
        int idDesligarLampadaSala = aplicativo.setComando(desligarLampadaSala);
        int idLigarLampadaQuarto = aplicativo.setComando(ligarLampadaQuarto);
        int idDesligarLampadaQuarto = aplicativo.setComando(desligarLampadaQuarto);
        int idLigarAr = aplicativo.setComando(ligarAr);
        int idDesligarAr = aplicativo.setComando(desligarAr);
        int idMudarTemperaturaAr = aplicativo.setComando(mudarTemperaturaAr);
        // ----- Vamos executar os comandos. -----
        aplicativo.aoPrecionarBotao(idLigarLampadaSala); // Ligar lâmpada da sala
        aplicativo.aoPrecionarBotao(idDesligarLampadaSala); // Desligar lâmpada da sala
        aplicativo.aoPrecionarBotao(idLigarLampadaQuarto); // Ligar lâmpada do quarto
        aplicativo.aoPrecionarBotao(idDesligarLampadaQuarto); // Desligar lâmpada da quarto
        aplicativo.aoPrecionarBotao(idLigarAr); // Ligar Ar-condicionado
        // Definir nova temperatura do Ar-condicionado
        mudarTemperaturaAr.setTemperatura(25);
        // Mudar temperatura do Ar-condicionado
        aplicativo.aoPrecionarBotao(idMudarTemperaturaAr);
        aplicativo.aoPrecionarBotao(idDesligarAr); // Desligar Ar-condicionado

        System.out.println();
        System.out.println("### Desfazer Comandos ###");
        System.out.println();

        aplicativo.duploCliqueBotao(idDesligarAr); // Defazer o comando ligar ar
        aplicativo.duploCliqueBotao(idMudarTemperaturaAr); // Desfazer a mudança de temperatura
        aplicativo.duploCliqueBotao(idLigarAr); // Desfazer o ligamento do ar
        aplicativo.duploCliqueBotao(idDesligarLampadaQuarto); // Defazer Desligar Lâmpada Quarto
    }
}
