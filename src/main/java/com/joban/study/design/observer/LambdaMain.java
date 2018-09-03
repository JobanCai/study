package com.joban.study.design.observer;

/**
 * Created by Joban on 2018/8/26.
 */
public class LambdaMain {

    public static void main(String[] args) {
        /**
         * lambda 写法
         */
        Subject subject = new ISubject();
        subject.register(text -> {
            System.out.println("sleepObserver" + text);
        });
        subject.register(text -> System.out.println("ReadObserver" + text));

        subject.notifyObserver(" joban");
    }

}
