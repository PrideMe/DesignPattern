package com.wang.creational.abstractFactory;

/**
 * @author wang.
 * @date 2018/7/5.
 * Description:
 */
public interface AbstractFactory {
    /**
     * 创建产品A
     * @return 产品A
     */
    ProductA factoryA();

    /**
     * 创建产品B
     * @return 返回产品B
     */
    ProductB factoryB();
}
