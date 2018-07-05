package com.wang.creational.factory;

/**
 * @author wang.
 * @date 2018/7/4.
 * Description:
 */
public class Grape implements Fruit {
    @Override
    public void grow() {
        System.out.println("葡萄生长");
    }

    @Override
    public void harvest() {
        System.out.println("葡萄收获");
    }

    @Override
    public void plant() {
        System.out.println("葡萄播种");
    }
}
