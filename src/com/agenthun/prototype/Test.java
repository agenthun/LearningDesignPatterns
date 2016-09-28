package com.agenthun.prototype;

/**
 * Created by agenthun on 2016/9/26.
 * 输出结果
 * WordDocument构造函数
 * mText = 文档
 * img = 图片1
 * img = 图片2
 * img = 图片3
 * mText = 文档
 * img = 图片1
 * img = 图片2
 * img = 图片3
 * mText = 文档副本
 * img = 图片1
 * img = 图片2
 * img = 图片3
 * img = 图片4 new
 * mText = 文档
 * img = 图片1
 * img = 图片2
 * img = 图片3
 * img = 图片4 new
 */
public class Test {
    public static void main(String[] args) {
        WordDocument originDocument = new WordDocument();
        originDocument.setText("文档");
        originDocument.addImage("图片1");
        originDocument.addImage("图片2");
        originDocument.addImage("图片3");
        originDocument.showDocument();

        WordDocument document = originDocument.clone();
        document.showDocument();
        //修改文档副本，不影响原文档
        document.setText("文档副本");
        document.addImage("图片4 new");
        document.showDocument();
        originDocument.showDocument(); //注意这里也同时修改了原对象
    }
}
