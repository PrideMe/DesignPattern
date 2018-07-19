package com.wang.behavioral.templateMethod;

/**
 * @author wang.
 * @date 2018/7/19.
 * Description:抽象模板
 */
public abstract class AbstractClass {
    protected abstract void operation();

    //模板方法
    public void templateMethod() {
        this.operation();
    }
}
