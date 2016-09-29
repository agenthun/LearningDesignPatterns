package com.agenthun.memento;

/**
 * Created by agenthun on 2016/9/29.
 * 输出结果
 * mCheckpoint = 1
 * mCheckpoint = 2
 * ---------------
 * 游戏进度 = CallOfDuty{mCheckpoint=2, mLifeValue=90, mWeapon='沙漠之鹰'}
 * 退出游戏
 * ---------------
 * 恢复后游戏进度 = CallOfDuty{mCheckpoint=2, mLifeValue=90, mWeapon='沙漠之鹰'}
 */
public class Test {
    public static void main(String[] args) {
        //建立Originator
        CallOfDuty game = new CallOfDuty();
        game.play();

        //存档
        Caretaker caretaker = new Caretaker();
        caretaker.archive(game.createMemento());

        //退出游戏
        game.quit();

        //通过Caretaker来恢复游戏
        CallOfDuty newGame = new CallOfDuty();
        newGame.restore(caretaker.getMemento());
    }
}
