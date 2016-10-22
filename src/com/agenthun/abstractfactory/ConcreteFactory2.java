package com.agenthun.abstractfactory;

/**
 * Created by agenthun on 2016/10/22.
 * 具体工厂2
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
