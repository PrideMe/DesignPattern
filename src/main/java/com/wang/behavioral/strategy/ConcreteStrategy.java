package com.wang.behavioral.strategy;

/**
 * @author wang.
 * @date 2018/7/24.
 * Description:策略模式-具体策略
 */
public class ConcreteStrategy extends Strategy {
    @Override
    public void strategyInterface() {
        System.out.println("具体策略");
    }
}
