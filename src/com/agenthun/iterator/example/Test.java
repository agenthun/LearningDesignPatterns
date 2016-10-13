package com.agenthun.iterator.example;

/**
 * Created by agenthun on 2016/10/13.
 */
public class Test {
    public static void main(String[] args) {
        //构造各个具体领导对象
        CroupLeader groupLeader = new CroupLeader();
        Director director = new Director();
        Manager manager = new Manager();
        Boss boss = new Boss();

        //设置各处理者对象
        groupLeader.nextHandler = director;
        director.nextHandler = manager;
        manager.nextHandler = boss;

        //发起请求
        groupLeader.handleRequest(100);
        groupLeader.handleRequest(2000);
        groupLeader.handleRequest(5000);
        groupLeader.handleRequest(50000);

        director.handleRequest(3000);
    }
}
