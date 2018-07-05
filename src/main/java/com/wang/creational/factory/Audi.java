package com.wang.creational.factory;

/**
 * @author wang.
 * @date 2018/7/4.
 * Description:
 */
public class Audi implements Car {
    @Override
    public void driver() {
        System.out.println("Audi start engine");
    }

    public Audi() {
        System.out.println("Create a Audi");
    }
}
