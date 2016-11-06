package com.agenthun.command.example;

/**
 * Created by agenthun on 2016/11/6.
 * 接收者，真正执行操作
 */
public class TetrisMachine {
    public void toLeft() {
        System.out.println("TetrisMachine 向左");
    }

    public void toRight() {
        System.out.println("TetrisMachine 向右");
    }

    public void fastToBottom() {
        System.out.println("TetrisMachine 快速落下");
    }

    public void transform() {
        System.out.println("TetrisMachine 改变形状");
    }
}
