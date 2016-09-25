package com.agenthun.subjectobserver;

import java.util.Observable;

/**
 * Created by agenthun on 16/9/23.
 * 被观察者，更新内容
 */
public class DevTechFrontierSubject extends Observable {
    public void postNewPublicatuion(String content) {
        setChanged();
        //通知所有的观察者，更新
        notifyObservers(content);
    }
}
