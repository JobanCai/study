package com.joban.study.design.observer;

/**
 * Created by Joban on 2018/8/26.
 */
public class GeneralMain {
    public static void main(String[] args) {
        Subject subject = new ISubject();
        SleepObserver sleepObserver = new SleepObserver();
        ReadObserver readObserver = new ReadObserver();
        subject.register(sleepObserver);//注册观察者
        subject.register(readObserver);

        subject.notifyObserver(" joban");
    }
}
