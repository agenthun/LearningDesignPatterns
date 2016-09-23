package com.agenthun.SubjectObserver;

/**
 * Created by agenthun on 16/9/23.
 * 输出结果
 * name = observer 3, arg = new msg
 * name = observer 2, arg = new msg
 * name = observer 1, arg = new msg
 */
public class Test {
    public static void main(String[] args) {
        //被观察者
        DevTechFrontierSubject subject = new DevTechFrontierSubject();
        //n个观察者
        CoderObserver observer1 = new CoderObserver("observer 1");
        CoderObserver observer2 = new CoderObserver("observer 2");
        CoderObserver observer3 = new CoderObserver("observer 3");

        //被观察者中加入可观察对象的观察者列表中
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        //被观察者发布新消息
        subject.postNewPublicatuion("new msg");
    }
}
