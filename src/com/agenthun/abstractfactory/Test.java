package com.agenthun.abstractfactory;

/**
 * Created by agenthun on 2016/10/22.
 * 具体产品A1的方法
 * 具体产品B1的方法
 * 具体产品A2的方法
 * 具体产品B2的方法
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory abstractFactory1 = new ConcreteFactory1();
        abstractFactory1.createProductA().method();
        abstractFactory1.createProductB().method();

        AbstractFactory abstractFactory2 = new ConcreteFactory2();
        abstractFactory2.createProductA().method();
        abstractFactory2.createProductB().method();
    }
}
