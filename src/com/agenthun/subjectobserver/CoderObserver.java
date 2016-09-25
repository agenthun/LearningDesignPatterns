package com.agenthun.subjectobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by agenthun on 16/9/23.
 * 观察者，实现订阅接口
 */
public class CoderObserver implements Observer {
    private String name;

    public CoderObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("name = " + name + ", arg = " + arg);
    }

    @Override
    public String toString() {
        return name;
    }
}
