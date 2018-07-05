package com.wang.creational.factory;

/**
 * @author wang.
 * @date 2018/7/4.
 * Description:
 */
public class AppleGardener implements FruitGardener {
    @Override
    public Fruit factory() {
        return new Apple();
    }
}
