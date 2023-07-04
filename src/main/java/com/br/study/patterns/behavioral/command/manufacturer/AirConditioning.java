package com.br.study.patterns.behavioral.command.manufacturer;

import java.util.StringJoiner;

public class AirConditioning {
    private String identification;
    private boolean state;
    private int temperature;

    public AirConditioning(String identification, boolean state, int temperature) {
        this.identification = identification;
        this.state = state;
        this.temperature = temperature;
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

    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        String onOrOff = this.state ? "On" : "Off";
        return String.format("The air conditioning in the %s is turned %s at %d degrees Celcius.", this.identification, onOrOff, this.temperature);
    }
}
