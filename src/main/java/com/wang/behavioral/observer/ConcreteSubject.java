package com.wang.behavioral.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author wang.
 * @date 2018/8/1.
 * Description:具体被观察者
 */
public class ConcreteSubject implements Subject {
    private Vector<Observer> observers = new Vector<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public Enumeration<Observer> observerEnumeration() {
        return observers.elements();
    }

    public void change() {
        this.notifyObserver();
    }
}
