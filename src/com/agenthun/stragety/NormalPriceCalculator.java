package com.agenthun.stragety;

/**
 * Created by agenthun on 2016/10/7.
 * 使用if-else，代码混乱，增加一种新的策略，将越来越臃肿，难以维护
 */
public class NormalPriceCalculator {
    private static final int BUS = 1;
    private static final int SUBWAY = 2;

    public static void main(String[] args) {
        NormalPriceCalculator calculator = new NormalPriceCalculator();
        System.out.println("公交车票价" + calculator.calculatePrice(16, BUS));
        System.out.println("地铁票价" + calculator.calculatePrice(16, SUBWAY));
    }

    private int calculatePrice(int km, int type) {
        if (type == BUS) {
            return busPrice(km);
        } else if (type == SUBWAY) {
            return subwayPrice(km);
        }
        return 0;
    }

    private int subwayPrice(int km) {
        if (km <= 6) {
            return 3;
        } else if (km > 6 && km < 12) {
            return 4;
        } else if (km > 12 && km < 22) {
            return 5;
        } else if (km > 22 && km < 32) {
            return 6;
        }
        return 7;
    }

    private int busPrice(int km) {
        int extraTotal = km - 10;
        int extraFactor = extraTotal / 5;
        int fraction = extraTotal % 5;
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }

}
