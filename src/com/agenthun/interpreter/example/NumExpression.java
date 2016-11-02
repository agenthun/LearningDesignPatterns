package com.agenthun.interpreter.example;

/**
 * Created by agenthun on 2016/11/2.
 * 数字解释器
 */
public class NumExpression extends ArithemticExpression {
    private int num;

    public NumExpression(int num) {
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}
