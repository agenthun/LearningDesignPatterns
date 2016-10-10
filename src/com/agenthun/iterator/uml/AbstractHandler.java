package com.agenthun.iterator.uml;

/**
 * Created by agenthun on 2016/10/10.
 * 抽象处理者
 */
public abstract class AbstractHandler {
    protected AbstractHandler nextHandler;

    /**
     * 处理请求
     *
     * @param request 请求对象
     */
    public final void handleRequest(AbstractRequest request) {
        //处理者与请求者处理级别一致
        if (getHandleLevel() == request.getRequestLevel()) {
            handle(request);
        } else {
            if (nextHandler != null) {
                //交给下一个处理者处理
                nextHandler.handleRequest(request);
            } else {
                //所有处理者均无法处理该请求
                System.out.println("All of handler can not handle the request");
            }
        }
    }

    /**
     * 获取处理者对象的处理级别
     *
     * @return 处理级别
     */
    protected abstract int getHandleLevel();

    /**
     * 每个处理者对象的具体处理方式
     *
     * @param request 请求者对象
     */
    protected abstract void handle(AbstractRequest request);
}
