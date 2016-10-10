package com.agenthun.iterator.uml;

/**
 * Created by agenthun on 2016/10/10.
 * 具体处理者
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandle1")) {
            System.out.println("ConcreteHandle1 handled");
            return;
        } else {
            successor.handleRequest(condition);
        }
    }
}
