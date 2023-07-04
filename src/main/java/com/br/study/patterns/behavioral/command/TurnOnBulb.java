package com.br.study.patterns.behavioral.command;

import com.br.study.patterns.behavioral.command.manufacturer.Bulb;

public class TurnOnBulb implements Command {
    private final Bulb bulb;

    public TurnOnBulb(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        this.bulb.on();
        System.out.println(this.bulb);
    }

    @Override
    public void undo() {
        this.bulb.off();
        System.out.println(this.bulb);
    }
}
