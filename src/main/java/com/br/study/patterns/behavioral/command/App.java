package com.br.study.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class App {
    private final List<Command> commands = new ArrayList<>();

    public int addCommands(Command command) {
        this.addCommands(command);
        return commands.size()-1;
    }

    public void onPressingButton(int id) {
        this.commands.get(id).execute();
    }

    public void doublePressingButton(int id) {
        this.commands.get(id).undo();
    }

    public Command getCommand(int id) {
        return this.commands.get(id);
    }
 }
