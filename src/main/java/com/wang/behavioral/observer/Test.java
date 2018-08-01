package com.wang.behavioral.observer;

/**
 * @author wang.
 * @date 2018/8/1.
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.attach(observer);
        subject.notifyObserver();
    }
}
