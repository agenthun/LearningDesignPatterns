package com.agenthun.command.example;

/**
 * Created by agenthun on 2016/11/6.
 * 具体快速落下命令类
 */
public class FastToBottomCommand implements Command {
    private TetrisMachine machine;

    public FastToBottomCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.fastToBottom();
    }
}
