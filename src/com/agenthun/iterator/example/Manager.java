package com.agenthun.iterator.example;

/**
 * Created by agenthun on 2016/10/13.
 */
public class Manager extends Leader {
    @Override
    public int limit() {
        return 10000;
    }

    @Override
    public void handle(int money) {
        System.out.println("经理报销" + money + "元");
    }
}
