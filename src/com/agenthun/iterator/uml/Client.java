package com.agenthun.iterator.uml;

/**
 * Created by agenthun on 2016/10/10.
 * 客户类
 */
public class Client {
    public static void main(String[] args) {
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        ConcreteHandler2 handler2 = new ConcreteHandler2();

        //handler1的下一个节点为handler2
        handler1.successor = handler2;
        //handler2的下一个节点为handler1
        handler2.successor = handler1;

        //处理请求
        handler1.handleRequest("ConcreteHandler2");
    }
}
