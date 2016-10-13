package com.agenthun.iterator.example;

/**
 * Created by agenthun on 2016/10/13.
 * 抽象领导者
 */
public abstract class Leader {
    protected Leader nextHandler;

    public final void handleRequest(int money) {
        if (money <= limit()) {
            handle(money);
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(money);
            }
        }
    }

    public abstract int limit();

    public abstract void handle(int money);
}
