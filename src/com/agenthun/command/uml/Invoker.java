package com.agenthun.command.uml;

/**
 * Created by agenthun on 2016/11/6.
 * 请求者
 */
public class Invoker {
    private Command command; //持有一个相应命令对象的引用

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
