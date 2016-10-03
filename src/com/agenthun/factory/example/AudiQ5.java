package com.agenthun.factory.example;

/**
 * Created by agenthun on 2016/10/3.
 * 具体产品
 */
public class AudiQ5 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Q5 dirve");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q5 selfNavigation");
    }
}
