package com.agenthun.abstractfactory;

/**
 * Created by agenthun on 2016/10/22.
 * 具体工厂1
 */
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
