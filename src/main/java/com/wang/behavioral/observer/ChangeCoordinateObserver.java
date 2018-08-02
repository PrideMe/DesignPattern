package com.wang.behavioral.observer;

/**
 * @author wang.
 * @date 2018/8/2.
 * Description:
 */
public class ChangeCoordinateObserver implements ClickableObserver {
    @Override
    public void clicked(Clickable clickable) {
        Button button = (Button) clickable;
        button.setX(100);
        button.setY(90);
    }
}
