package com.br.study.patterns.behavioral.command;

import com.br.study.patterns.behavioral.command.manufacturer.Bulb;

public class TurnOffBulb implements Command {
    private final Bulb bulb;

    public TurnOffBulb(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        this.bulb.off();
        System.out.println(this.bulb);
    }

    @Override
    public void undo() {
        this.bulb.on();
        System.out.println(this.bulb);
    }
}
