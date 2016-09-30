package com.agenthun.proxy;

/**
 * Created by agenthun on 2016/9/30.
 * 真实主题类
 */
public class RealSubject extends Subject {
    @Override
    public void visit() {
        System.out.println("RealSubject visit()");
    }
}
