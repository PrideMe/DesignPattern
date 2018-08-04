package com.wang.behavioral.visitor;

/**
 * @author wang.
 * @date 2018/8/4.
 * Description:具体访问者
 */
public class ConcreteVisitor implements Visitor {
    @Override
    public void visitor(ConcreteElement1 concreteElement1) {
        concreteElement1.operation();
    }

    @Override
    public void visitor(ConcreteElement2 concreteElement2) {
        concreteElement2.operation();
    }
}
