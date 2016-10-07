package com.agenthun.stragety;

/**
 * Created by agenthun on 2016/10/7.
 * 输出
 * 公交车票价3
 * 地铁票价5
 * 出租车票价32
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.setStrategy(new BusStrategy());
        System.out.println("公交车票价" + test.calculatePrice(16));

        test.setStrategy(new SubwayStrategy());
        System.out.println("地铁票价" + test.calculatePrice(16));

        test.setStrategy(new TaxiStrategy());
        System.out.println("出租车票价" + test.calculatePrice(16));
    }

    CalculateStrategy mStrategy;

    public void setStrategy(CalculateStrategy mStrategy) {
        this.mStrategy = mStrategy;
    }

    public int calculatePrice(int km) {
        return mStrategy.calculatePrice(km);
    }
}
