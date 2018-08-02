package com.wang.behavioral.observer;

/**
 * @author wang.
 * @date 2018/8/2.
 * Description:
 */
public class OtherObserver implements ClickableObserver {
    @Override
    public void clicked(Clickable clickable) {
        System.out.println("执行其他操作");
    }
}
