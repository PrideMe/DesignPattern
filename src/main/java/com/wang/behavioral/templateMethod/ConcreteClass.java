package com.wang.behavioral.templateMethod;

/**
 * @author wang.
 * @date 2018/7/19.
 * Description:具体模板
 */
public class ConcreteClass extends AbstractClass {
    @Override
    protected void operation() {
        System.out.println("子类基本业务逻辑");
    }
}
