package com.wang.structural.adapter;

/**
 * @author wang.
 * @date 2018/7/9.
 * Description:
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.specificRequest();
    }
}
