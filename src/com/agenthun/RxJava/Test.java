package com.agenthun.RxJava;

import rx.Observable;
import rx.functions.Action1;

/**
 * Created by agenthun on 16/9/24.
 * RxJava Test easy
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

    public static void main(String[] args) {
        hello("A", "B", "C");
    }
}
