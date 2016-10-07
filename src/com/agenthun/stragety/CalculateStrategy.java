package com.agenthun.stragety;

/**
 * Created by agenthun on 2016/10/7.
 * 抽象的价格计算接口
 * 抽象策略接口
 */
public interface CalculateStrategy {
    int calculatePrice(int km);
}
