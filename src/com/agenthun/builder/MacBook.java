package com.agenthun.builder;

/**
 * Created by agenthun on 16/9/24.
 * 具体的Product
 */
public class MacBook extends ComputerProduct {
    public MacBook() {
    }

    @Override
    public void setOS() {
        mOS = "macOS";
    }
}
