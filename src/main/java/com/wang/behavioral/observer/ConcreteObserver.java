package com.wang.behavioral.observer;

/**
 * @author wang.
 * @date 2018/8/1.
 * Description:具体观察者
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("观察者已收到通知");
    }
}
