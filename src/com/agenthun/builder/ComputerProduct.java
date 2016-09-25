package com.agenthun.builder;

/**
 * Created by agenthun on 16/9/24.
 * 抽象的产品类
 * 一台计算机：主板、显示器、操作系统
 */
public abstract class ComputerProduct {

    protected String mBoard; //主板
    protected String mDisplay; //显示器
    protected String mOS; //操作系统

    public ComputerProduct() {
    }

    public void setBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public void setDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public abstract void setOS();

    @Override
    public String toString() {
        return "ComputerProduct{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }
}
