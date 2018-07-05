package com.wang.creational.factory;

/**
 * @author wang.
 * @date 2018/7/4.
 * Description:
 */
public class Apple implements Fruit {
    @Override
    public void grow() {
        System.out.println("苹果生长");
    }

    @Override
    public void harvest() {
        System.out.println("苹果收获");
    }

    @Override
    public void plant() {
        System.out.println("苹果播种");
    }
}
