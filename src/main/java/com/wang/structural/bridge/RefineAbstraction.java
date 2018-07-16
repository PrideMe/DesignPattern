package com.wang.structural.bridge;

/**
 * @author wang.
 * @date 2018/7/16.
 * Description:
 */
public class RefineAbstraction extends Abstraction {

    public RefineAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("子类");
    }
}
