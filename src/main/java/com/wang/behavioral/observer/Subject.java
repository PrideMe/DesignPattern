package com.wang.behavioral.observer;

/**
 * @author wang.
 * @date 2018/8/1.
 * Description:抽象被观察者
 */
public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObserver();
}
