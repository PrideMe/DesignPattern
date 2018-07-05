package com.wang.creational.factory;

/**
 * @author wang.
 * @date 2018/7/5.
 * Description:
 */
public class Benz implements Car {
    public Benz() {
        System.out.println("Create a Benz");
    }

    @Override
    public void driver() {
        System.out.println("Benz start engine");
    }
}
