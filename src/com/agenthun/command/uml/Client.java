package com.agenthun.command.uml;

/**
 * Created by agenthun on 2016/11/6.
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver(); //接收者对象
        Command command = new ConcreteCommand(receiver); //具体的命令对象
        Invoker invoker = new Invoker(command); //接收者
        invoker.action(); //接收者执行请求方法
    }
}
