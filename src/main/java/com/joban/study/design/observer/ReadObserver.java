package com.joban.study.design.observer;

/**
 * Created by Jerliner on 2018/8/26.
 */
public class ReadObserver implements Observer {
    @Override
    public void notify(String text) {
        System.out.println(text + "ReadObserver");
    }
}
