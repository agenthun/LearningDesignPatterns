package com.agenthun.Builder;

/**
 * Created by agenthun on 16/9/24.
 * 抽象的Builder
 */
public abstract class Builder {
    //设置主板
    public abstract void buildBoard(String board);

    //设置显示器
    public abstract void buildDisplay(String display);

    //设置操作系统
    public abstract void buildOS();

    //组合，建立Computer
    public abstract ComputerProduct create();
}
