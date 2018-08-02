package com.wang.behavioral.observer;

/**
 * @author wang.
 * @date 2018/8/2.
 * Description:
 */
public class ChangeColorObsever implements ClickableObserver {
    @Override
    public void clicked(Clickable clickable) {
        Button button = (Button) clickable;
        button.setColor("红色");
    }
}
