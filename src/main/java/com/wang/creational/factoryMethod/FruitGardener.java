package com.wang.creational.factoryMethod;

/**
 * @author wang.
 * @date 2018/7/4.
 * Description: 水果园丁工厂
 */
public interface FruitGardener {
    /**
     * 生产水果
     * @return 水果
     */
    Fruit factory();
}
