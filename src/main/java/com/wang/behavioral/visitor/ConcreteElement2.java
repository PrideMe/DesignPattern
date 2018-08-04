package com.wang.behavioral.visitor;

/**
 * @author wang.
 * @date 2018/8/4.
 * Description:具体元素2
 */
public class ConcreteElement2 extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }

    public void operation() {
        System.out.println("访问元素2");
    }
}
