package com.agenthun.factory.uml;

/**
 * Created by agenthun on 2016/10/2.
 * 抽象工厂类
 */
public abstract class Factory {
    public abstract Product createProduct();

    public abstract <T extends Product> T createProduct(Class<T> clz);
}
