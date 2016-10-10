package com.agenthun.iterator.uml;

/**
 * Created by agenthun on 2016/10/10.
 * 输出结果
 * Handler1 handle request: 1
 * Handler2 handle request: 2
 * Handler3 handle request: 3
 */
public class Test {
    public static void main(String[] args) {
        //创建三个处理者
        AbstractHandler handler1 = new Handler1();
        AbstractHandler handler2 = new Handler2();
        AbstractHandler handler3 = new Handler3();

        handler1.nextHandler = handler2;
        handler2.nextHandler = handler3;

        //创建三个请求者
        AbstractRequest request1 = new Request1("Request1");
        AbstractRequest request2 = new Request2("Request2");
        AbstractRequest request3 = new Request3("Request3");

        //从链式的首端发起请求
        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
        handler1.handleRequest(request3);
    }
}
