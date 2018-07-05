package com.wang.creational.factory;

/**
 * @author wang.
 * @date 2018/7/5.
 * Description:
 */
public class Bmw implements Car {
    public Bmw() {
        System.out.println("Create a Bmw");
    }

    @Override
    public void driver() {
        System.out.println("Bmw start engine");
    }
}
