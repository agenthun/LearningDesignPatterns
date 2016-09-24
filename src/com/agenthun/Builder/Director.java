package com.agenthun.Builder;

/**
 * Created by agenthun on 16/9/24.
 * 统一组装，Director负责构造Computer，产品
 */
public class Director {
    Builder mBuilder = null;

    public Director(Builder mBuilder) {
        this.mBuilder = mBuilder;
    }

    public void construct(String board, String display) {
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}
