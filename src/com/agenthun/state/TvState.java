package com.agenthun.state;

/**
 * Created by agenthun on 2016/10/9.
 * 抽象状态接口
 */
public interface TvState {
    public void nextChannel();

    public void prevChannel();

    public void turnUp();

    public void turnDown();
}
