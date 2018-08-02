package com.wang.behavioral.observer;

/**
 * @author wang.
 * @date 2018/8/2.
 * Description:抽象被观察者-可单击控件
 */
public interface Clickable {
    void click();

    void addClickableObserver(ClickableObserver clickableObserver);

    void removeClickableObserver(ClickableObserver clickableObserver);
}
