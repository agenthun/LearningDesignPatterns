package com.agenthun.proxy.example;

import java.lang.reflect.Proxy;

/**
 * Created by agenthun on 2016/10/1.
 * 静态代理
 * 已知被代理对象为hun
 * 动态代理
 * 为hun构造动态代理律师,不需要知道为谁代理
 */
public class Test {
    public static void main(String[] args) {
        ILawsuit caseSubmitter = new CaseSubmitter();//创建被代理人

        System.out.println("开始静态代理");
        //静态代理
        StaticLawyer lawyer = new StaticLawyer(caseSubmitter); //为被代理人提供代理，静态代理，指定为hun代理
        //代理人替被代理者提供服务
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
        System.out.println();

        System.out.println("开始动态代理");
        //动态代理，利用反射机制
        DynamicProxy dynamicProxy = new DynamicProxy(caseSubmitter);
        ClassLoader loader = caseSubmitter.getClass().getClassLoader(); //获取被代理人的ClassLoader
        ILawsuit dynamicLawyer = (ILawsuit) Proxy.newProxyInstance(loader, new Class[]{ILawsuit.class}, dynamicProxy); //动态构造一个代理律师
        dynamicLawyer.submit();
        dynamicLawyer.burden();
        dynamicLawyer.defend();
        dynamicLawyer.finish();
        System.out.println();
    }
}
