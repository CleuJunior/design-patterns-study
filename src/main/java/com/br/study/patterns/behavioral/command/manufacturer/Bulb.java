package com.br.study.patterns.behavioral.command.manufacturer;

public class Bulb {
    private String identification;
    private boolean state;

    public Bulb(String identification, boolean state) {
        this.identification = identification;
        this.state = state;
    }

    public void on() {
        this.state = true;
    }

    public void off() {
        this.state = false;
    }

    public String getIdentification() {
        return this.identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public boolean getState() {
        return this.state;
    }

    @Override
    public String toString() {
        String onOrOff = this.state ? "On" : "Off";
        return String.format("The bulb in the %s, is turned %s.", this.identification, onOrOff);
    }
}
