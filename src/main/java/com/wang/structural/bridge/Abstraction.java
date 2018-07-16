package com.wang.structural.bridge;

/**
 * @author wang.
 * @date 2018/7/16.
 * Description:
 */
public abstract class Abstraction {
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}
