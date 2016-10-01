package com.agenthun.proxy.example;

/**
 * Created by agenthun on 2016/10/1.
 * 具体诉讼人，被代理人
 */
public class CaseSubmitter implements ILawsuit {
    @Override
    public void submit() {
        System.out.println("hun提交申请");
    }

    @Override
    public void burden() {
        System.out.println("hun开始举证");
    }

    @Override
    public void defend() {
        System.out.println("hun开始辩护");
    }

    @Override
    public void finish() {
        System.out.println("hun诉讼完成");
    }
}
