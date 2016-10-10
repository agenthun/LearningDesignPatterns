package com.agenthun.iterator.uml;

/**
 * Created by agenthun on 2016/10/10.
 * 抽象请求者
 */
public abstract class AbstractRequest {
    private Object obj; //处理对象

    public AbstractRequest(Object obj) {
        this.obj = obj;
    }

    public Object getContent() {
        return obj;
    }

    /**
     * 获取请求级别
     *
     * @return 请求级别
     */
    public abstract int getRequestLevel();
}
