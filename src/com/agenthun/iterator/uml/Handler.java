package com.agenthun.iterator.uml;

/**
 * Created by agenthun on 2016/10/10.
 * 抽象处理者
 */
public abstract class Handler {
    protected Handler successor;

    /**
     * 请求处理
     *
     * @param condition
     */
    public abstract void handleRequest(String condition);
}
