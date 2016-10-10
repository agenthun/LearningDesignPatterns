package com.agenthun.iterator.uml;

/**
 * Created by agenthun on 2016/10/10.
 * 具体处理者
 */
public class Handler1 extends AbstractHandler {
    @Override
    protected int getHandleLevel() {
        return 1;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handler1 handle request: " + request.getRequestLevel());
    }
}
