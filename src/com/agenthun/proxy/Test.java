package com.agenthun.proxy;

/**
 * Created by agenthun on 2016/9/30.
 */
public class Test {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(realSubject);
        //调用代理模式相关方法
        proxySubject.visit();
    }
}
