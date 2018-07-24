package com.wang.behavioral.strategy;

/**
 * @author wang.
 * @date 2018/7/24.
 * Description:策略模式-环境角色
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 调用策略模式
     */
    public void contextInterface() {
        this.strategy.strategyInterface();
    }
}
