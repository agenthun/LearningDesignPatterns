package com.agenthun.interpreter.example;

/**
 * Created by agenthun on 2016/11/2.
 * 2642
 */
public class Client {
    public static void main(String[] args) {
        //字符串以空格区分
        Calculator calculator = new Calculator("153 + 3589 + 118 - 555 - 597 - 66");
        System.out.println(calculator.calculate());
    }
}
