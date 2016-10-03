package com.agenthun.factory.example;

/**
 * Created by agenthun on 2016/10/3.
 * 具体抽象工厂
 */
public abstract class AudiFactory {
    public abstract <T extends AudiCar> T createAudiCar(Class<T> clz);
}
