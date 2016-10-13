package com.agenthun.iterator.example;

/**
 * Created by agenthun on 2016/10/13.
 * 具体领导者
 */
public class CroupLeader extends Leader {
    @Override
    public int limit() {
        return 1000;
    }

    @Override
    public void handle(int money) {
        System.out.println("组长报销" + money + "元");
    }
}
