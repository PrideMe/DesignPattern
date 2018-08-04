package com.wang.behavioral.visitor;

/**
 * @author wang.
 * @date 2018/8/4.
 * Description:抽象访问者
 */
public interface Visitor {
    void visitor(ConcreteElement1 concreteElement1);
    void visitor(ConcreteElement2 concreteElement2);
}
