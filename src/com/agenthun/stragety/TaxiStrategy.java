package com.agenthun.stragety;

/**
 * Created by agenthun on 2016/10/7.
 * 具体策略，实现抽象策略接口
 */
public class TaxiStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        return km * 2;
    }
}
