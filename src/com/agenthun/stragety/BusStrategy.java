package com.agenthun.stragety;

/**
 * Created by agenthun on 2016/10/7.
 * 具体策略，实现抽象策略接口
 */
public class BusStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        int fraction = extraTotal % 5;
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }
}
