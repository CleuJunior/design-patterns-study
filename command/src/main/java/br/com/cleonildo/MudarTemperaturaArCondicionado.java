package br.com.cleonildo;

public class MudarTemperaturaArCondicionado implements Command {
    private final ArCondicionado arCondicionado; // O ar-condicionado que terá a temperatura mudada.
    private int temperatura;
    private int temperaturaAnterior;

    public MudarTemperaturaArCondicionado(ArCondicionado arCondicionado) {
        this.arCondicionado = arCondicionado;
        this.temperatura = arCondicionado.getTemperatura();
    }

    // Define a temperatura que o ArCondicionado terá quando o método executar for chamado.
    public void setTemperatura(int temperatura) {
        // Salva a temperatura antiga
        this.temperaturaAnterior = this.temperatura;
        // Define a nova temperatura
        this.temperatura = temperatura;
    }

    @Override
    public void executar() {
        // No método executar, chamar o método setTemperatura() de um objeto ArCondicionado
        this.arCondicionado.setTemperatura(this.temperatura);
        // Chamar o método imprimeObjeto() de um objeto ArCondicionado para dar feedback
        this.arCondicionado.imprimeObjeto();
    }

    @Override
    public void desfazer() {
        // No método desfazer, chamar o método setTemperatura() de um objeto ArCondicionado
        this.arCondicionado.setTemperatura(this.temperaturaAnterior);
        // Chamar o método imprimeObjeto() de um objeto ArCondicionado para dar feedback
        this.arCondicionado.imprimeObjeto();
    }
}
