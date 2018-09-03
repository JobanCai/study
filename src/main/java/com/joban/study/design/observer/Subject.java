package com.joban.study.design.observer;

/**
 * Created by Joban on 2018/8/26.
 */
public interface Subject {

    void register(Observer observer);// 注册观察者

    void notifyObserver(String text);//通知所有观察者事件的到来

}
