package com.agenthun.command.example;

/**
 * Created by agenthun on 2016/11/6.
 * 具体改变形状命令类
 */
public class TransformCommand implements Command {
    private TetrisMachine machine;

    public TransformCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        machine.transform();
    }
}
