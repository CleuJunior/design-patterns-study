package com.br.study.patterns.behavioral.command;

import com.br.study.patterns.behavioral.command.manufacturer.AirConditioning;

public class TurnOffAriConditioning implements Command {
    private final AirConditioning airConditioning;

    public TurnOffAriConditioning(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public void execute() {
        this.airConditioning.off();
        System.out.println(this.airConditioning);
    }

    @Override
    public void undo() {
        this.airConditioning.on();
        System.out.println(this.airConditioning);
    }
}
