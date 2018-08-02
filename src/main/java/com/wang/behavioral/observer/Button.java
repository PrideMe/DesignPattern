package com.wang.behavioral.observer;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wang.
 * @date 2018/8/2.
 * Description: 具体被观察者
 */
@Getter
@Setter
public class Button implements Clickable {
    private List<ClickableObserver> observers = new ArrayList<>();
    private String color;
    private int x, y;

    @Override
    public void click() {
        System.out.println("按钮被点击");
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).clicked(this);
        }
    }

    @Override
    public void addClickableObserver(ClickableObserver clickableObserver) {
        observers.add(clickableObserver);
    }

    @Override
    public void removeClickableObserver(ClickableObserver clickableObserver) {
        observers.remove(clickableObserver);
    }

    @Override
    public String toString() {
        return "按钮颜色"+color+"，坐标"+x+","+y;
    }
}
