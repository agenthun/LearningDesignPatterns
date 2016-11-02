package com.agenthun.interpreter.example;

import java.util.Stack;

/**
 * Created by agenthun on 2016/11/2.
 */
public class Calculator {
    private Stack<ArithemticExpression> mExpStack = new Stack<>();

    public Calculator(String expression) {
        ArithemticExpression exp1, exp2;
        String[] elements = expression.split(" ");

        for (int i = 0; i < elements.length; i++) {
            switch (elements[i].charAt(0)) {
                case '+':
                    exp1 = mExpStack.pop();
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    mExpStack.push(new AdditionExpression(exp1, exp2));
                    break;
                case '-':
                    exp1 = mExpStack.pop();
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    mExpStack.push(new SubtractionExpression(exp1, exp2));
                    break;
                default:
                    mExpStack.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }

    //计算结果
    public int calculate() {
        return mExpStack.pop().interpret();
    }
}
