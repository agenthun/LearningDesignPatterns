package com.agenthun.factory.uml;

/**
 * Created by agenthun on 2016/10/2.
 */
public class Test {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product pA = factory.createProduct(); //具体的ProductA
        pA.method();

        Product p = factory.createProduct(ConcreteProductB.class); //利用反射机制
        p.method();
    }
}
