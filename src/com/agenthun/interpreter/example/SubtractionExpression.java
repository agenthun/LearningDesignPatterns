package com.agenthun.interpreter.example;

/**
 * Created by agenthun on 2016/11/2.
 * 减法运算解释器
 */
public class SubtractionExpression extends OperatorExpression {
    public SubtractionExpression(ArithemticExpression exp1, ArithemticExpression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpret() {
        return exp1.interpret() - exp2.interpret();
    }
}
