package com.agenthun.memento;

/**
 * Created by agenthun on 2016/9/29.
 * Originator,建立备忘录，记录、恢复自身内部状态
 */
public class CallOfDuty {
    private int mCheckpoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "沙漠之鹰";

    //开始游戏
    public void play() {
        System.out.println("mCheckpoint = " + mCheckpoint);
        mLifeValue -= 10;
        mCheckpoint++;
        System.out.println("mCheckpoint = " + mCheckpoint);
    }

    //退出游戏
    public void quit() {
        System.out.println("---------------");
        System.out.println("游戏进度 = " + this.toString());
        System.out.println("退出游戏");
        System.out.println("---------------");
    }

    //创建备忘录
    public Memento createMemento() {
        Memento memento = new Memento();
        memento.mCheckpoint = mCheckpoint;
        memento.mLifeValue = mLifeValue;
        memento.mWeapon = mWeapon;
        return memento;
    }

    //恢复游戏
    public void restore(Memento memento) {
        this.mCheckpoint = memento.mCheckpoint;
        this.mLifeValue = memento.mLifeValue;
        this.mWeapon = memento.mWeapon;
        System.out.println("恢复后游戏进度 = " + this.toString());
    }

    @Override
    public String toString() {
        return "CallOfDuty{" +
                "mCheckpoint=" + mCheckpoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }
}
