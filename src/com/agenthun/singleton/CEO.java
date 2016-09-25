package com.agenthun.singleton;

/**
 * Created by agenthun on 16/9/25.
 * 一个CEO，饿汉单例模式
 */
public class CEO extends Staff {
    private static final CEO mCeo = new CEO();

    private CEO() {

    }

    public static CEO getCeo() {
        return mCeo;
    }

    @Override
    public void work() {
        //管理VP
    }
}
