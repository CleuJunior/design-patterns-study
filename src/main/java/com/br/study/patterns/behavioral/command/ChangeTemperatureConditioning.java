package com.br.study.patterns.behavioral.command;

import com.br.study.patterns.behavioral.command.manufacturer.AirConditioning;

public class ChangeTemperatureConditioning implements Command {
    private final AirConditioning airConditioning;
    private int temperature;
    private int previousTemperature;

    public ChangeTemperatureConditioning(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
        this.temperature = this.airConditioning.getTemperature();
    }

    public void setTemperature(int temperature) {
        this.previousTemperature = this.temperature;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        this.airConditioning.setTemperature(this.temperature);
        System.out.println(this.airConditioning);
    }

    @Override
    public void undo() {
        this.airConditioning.setTemperature(this.previousTemperature);
        System.out.println(this.airConditioning);
    }
}
