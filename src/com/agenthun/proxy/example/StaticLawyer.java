package com.agenthun.proxy.example;

/**
 * Created by agenthun on 2016/10/1.
 * 代理人，静态代理类
 */
public class StaticLawyer implements ILawsuit {
    private ILawsuit mILawsuit;

    public StaticLawyer(ILawsuit mILawsuit) {
        this.mILawsuit = mILawsuit;
    }

    @Override
    public void submit() {
        mILawsuit.submit();
    }

    @Override
    public void burden() {
        mILawsuit.burden();
    }

    @Override
    public void defend() {
        mILawsuit.defend();
    }

    @Override
    public void finish() {
        mILawsuit.finish();
    }
}
