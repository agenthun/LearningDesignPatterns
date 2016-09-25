package com.agenthun.builder;

/**
 * Created by agenthun on 16/9/24.
 * 输出结果
 * product = ComputerProduct{mBoard='Intel', mDisplay='Retina', mOS='macOS'}
 */
public class Test {
    public static void main(String[] args) {
        //构建器
        Builder builder = new MacBookBuilder();
        //组装
        Director director = new Director(builder);

        //设置各部件
        director.construct("Intel", "Retina");

        //组装出的产品
        ComputerProduct product = builder.create();
        System.out.println("product = " + product);
    }
}
