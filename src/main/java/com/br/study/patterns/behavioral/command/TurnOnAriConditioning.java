package com.br.study.patterns.behavioral.command;

import com.br.study.patterns.behavioral.command.manufacturer.AirConditioning;

public class TurnOnAriConditioning implements Command {
    private final AirConditioning airConditioning;

    public TurnOnAriConditioning(AirConditioning airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public void execute() {
        this.airConditioning.on();
        System.out.println(this.airConditioning);
    }

    @Override
    public void undo() {
        this.airConditioning.off();
        System.out.println(this.airConditioning);
    }
}
