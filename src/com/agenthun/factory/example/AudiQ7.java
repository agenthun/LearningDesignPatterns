package com.agenthun.factory.example;

/**
 * Created by agenthun on 2016/10/3.
 * 具体产品
 */
public class AudiQ7 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Q7 dirve");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q7 selfNavigation");
    }
}
