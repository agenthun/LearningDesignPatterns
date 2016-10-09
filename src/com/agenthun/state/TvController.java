package com.agenthun.state;

/**
 * Created by agenthun on 2016/10/9.
 * 遥控器，经典状态模式中的Context
 */
public class TvController implements PowerController {

    TvState mTvState;

    public void setTvState(TvState mTvState) {
        this.mTvState = mTvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        System.out.println("开机");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        System.out.println("关机");
    }

    public void nextChannel() {
        mTvState.nextChannel();
    }

    public void turnUp() {
        mTvState.turnUp();
    }

    public void turnDown() {
        mTvState.turnDown();
    }

    public void prevChannel() {
        mTvState.prevChannel();
    }
}
