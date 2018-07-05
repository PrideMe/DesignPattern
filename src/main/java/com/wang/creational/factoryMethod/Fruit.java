package com.wang.creational.factoryMethod;

/**
 * @author wang.
 * @date 2018/7/4.
 * Description: 抽象水果
 */
public interface Fruit {
    /**
     * 生长
     */
    void grow();

    /**
     * 收获
     */
    void harvest();

    /**
     * 播种
     */
    void plant();
}
