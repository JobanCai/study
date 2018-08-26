package com.joban.study.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jerliner on 2018/8/26.
 */
public class ISubject implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver(String text) {
        observers.forEach(observer -> observer.notify(text));
    }
}
