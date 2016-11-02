package com.agenthun.interpreter.example;

/**
 * Created by agenthun on 2016/11/2.
 * 抽象的运算符号解释器
 */
public abstract class OperatorExpression extends ArithemticExpression {
    protected ArithemticExpression exp1, exp2;

    public OperatorExpression(ArithemticExpression exp1, ArithemticExpression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
}
