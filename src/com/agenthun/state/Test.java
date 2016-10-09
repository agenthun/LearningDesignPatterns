package com.agenthun.state;

/**
 * Created by agenthun on 2016/10/9.
 * 输出结果
 * 开机
 * 下一个频道
 * 关机
 */
public class Test {
    public static void main(String[] args) {
        TvController tvController = new TvController(); //建立一个遥控器
        tvController.powerOn();
        tvController.nextChannel();
        tvController.powerOff(); //关机
        tvController.prevChannel(); //关机后操作无效
    }
}
