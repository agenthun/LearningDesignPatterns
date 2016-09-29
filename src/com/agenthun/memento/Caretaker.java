package com.agenthun.memento;

/**
 * Created by agenthun on 2016/9/29.
 * 负责存储备忘录，不能访问备忘录内容和对内容操作，只是将备忘录传递给其它对象
 */
public class Caretaker {

    Memento memento;

    //存档
    public void archive(Memento memento) {
        this.memento = memento;
    }

    //获取存档
    public Memento getMemento() {
        return memento;
    }
}
