package com.wang.structural.decorator;

/**
 * @author wang.
 * @date 2018/7/9.
 * Description:
 */
public class Benz implements Car {
    @Override
    public void show() {
        System.out.println("奔驰车的默认颜色是黑色");
    }
}
