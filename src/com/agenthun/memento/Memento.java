package com.agenthun.memento;

/**
 * Created by agenthun on 2016/9/29.
 * 备忘录类
 */
public class Memento {
    public int mCheckpoint;
    public int mLifeValue;
    public String mWeapon;

    @Override
    public String toString() {
        return "Memento{" +
                "mCheckpoint=" + mCheckpoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon=" + mWeapon +
                '}';
    }
}
