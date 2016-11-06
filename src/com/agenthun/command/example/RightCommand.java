package com.agenthun.command.example;

/**
 * Created by agenthun on 2016/11/6.
 * 具体向左命令类
 */
public class RightCommand implements Command {
    private TetrisMachine machine;

    public RightCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.toRight();
    }
}
