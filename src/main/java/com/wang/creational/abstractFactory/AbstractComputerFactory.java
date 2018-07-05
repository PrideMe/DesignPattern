package com.wang.creational.abstractFactory;

/**
 * @author wang.
 * @date 2018/7/5.
 * Description: 抽象的一个产品族的工厂。产品族：不同的产品
 */
public interface AbstractComputerFactory {
    CPU createrCPU();

    MainBoard createMainBoard();
}
