package com.agenthun.iterator.uml;

/**
 * Created by agenthun on 2016/10/10.
 * 具体请求者
 */
public class Request1 extends AbstractRequest {
    public Request1(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 1;
    }
}
