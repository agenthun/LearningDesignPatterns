package com.agenthun.command.uml;

/**
 * Created by agenthun on 2016/11/6.
 * 具体命令类
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
