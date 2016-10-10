package com.agenthun.iterator.uml;

/**
 * Created by agenthun on 2016/10/10.
 * 具体处理者
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandle2")) {
            System.out.println("ConcreteHandle2 handled");
            return;
        } else {
            successor.handleRequest(condition);
        }
    }
}
