package com.agenthun.iterator.uml;

/**
 * Created by agenthun on 2016/10/10.
 * 具体处理者
 */
public class Handler3 extends AbstractHandler {
    @Override
    protected int getHandleLevel() {
        return 3;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handler3 handle request: " + request.getRequestLevel());
    }
}
