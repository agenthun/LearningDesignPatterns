package com.agenthun.rxjava;

import rx.Observable;
import rx.functions.Action1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by agenthun on 16/9/24.
 * rxjava Test easy
 * 输出结果
 * Hello A
 * Hello B
 * Hello C
 */
public class Test {
    private static void hello(String... names) {
        Observable.from(names).subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                System.out.println("Hello " + s);
            }
        });
    }

    private static Observable<String> createObservableFromData(String name) {
        return Observable.just(name);
    }

    private static Observable<String> createObservableFromData(String... names) {
        return Observable.from(names);
    }

    private static Observable<String> createObservableFromData(List<String> list) {
        return Observable.from(list);
    }

    public static void main(String[] args) {
        hello("A", "B", "C");

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        Observable<String> observable1 = createObservableFromData(list);
        Observable<String> observable2 = createObservableFromData("A", "B", "C");
        Observable<String> observable3 = createObservableFromData("just one");

        System.out.println("observable1 = " + observable1.toString());
        System.out.println("observable2 = " + observable2.toString());
        System.out.println("observable3 = " + observable3.toString());
    }
}
