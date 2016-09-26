package com.agenthun.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by agenthun on 2016/9/26.
 * 作为ConcretePrototype
 */
public class WordDocument implements Cloneable {
    private String mText;
    private ArrayList<String> mImages = new ArrayList<>();

    public WordDocument() {
        System.out.println("WordDocument构造函数");
    }

    protected WordDocument clone() {
        try {
            WordDocument document = (WordDocument) super.clone();
            document.mText = this.mText;
            document.mImages = this.mImages;
            return document;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public List<String> getImages() {
        return mImages;
    }

    public void addImage(String img) {
        this.mImages.add(img);
    }

    public void showDocument() {
        System.out.println("mText = " + mText);
        for (String img :
                mImages) {
            System.out.println("img = " + img);
        }
    }
}
