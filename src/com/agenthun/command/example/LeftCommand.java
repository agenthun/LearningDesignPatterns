package com.agenthun.command.example;

/**
 * Created by agenthun on 2016/11/6.
 * 具体向左命令类
 */
public class LeftCommand implements Command {
    private TetrisMachine machine;

    public LeftCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.toLeft();
    }
}
