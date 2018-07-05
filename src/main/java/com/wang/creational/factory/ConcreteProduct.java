package com.wang.creational.factory;

/**
 * @author wang.
 * @date 2018/7/4.
 * Description:工厂模式之工厂方法，具体产品
 */
public class ConcreteProduct implements Product {
    @Override
    public void method1() {
        System.out.println("具体工厂1");
    }

    @Override
    public void method2() {
        System.out.println("具体工厂2");
    }
}
