package com.agenthun.proxy;

/**
 * Created by agenthun on 2016/9/30.
 * 代理类
 */
public class ProxySubject extends Subject {
    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void visit() {
        realSubject.visit();
    }
}
