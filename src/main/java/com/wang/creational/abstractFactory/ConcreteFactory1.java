package com.wang.creational.abstractFactory;

/**
 * @author wang.
 * @date 2018/7/5.
 * Description:
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public ProductA factoryA() {
        //创建等级为1的产品A
        return new ProductA1();
    }

    @Override
    public ProductB factoryB() {
        //创建等级为1的产品B
        return new ProductB1();
    }
}
