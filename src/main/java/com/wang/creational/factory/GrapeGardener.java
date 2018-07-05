package com.wang.creational.factory;

/**
 * @author wang.
 * @date 2018/7/4.
 * Description:
 */
public class GrapeGardener implements FruitGardener {
    @Override
    public Fruit factory() {
        return new Grape();
    }
}
