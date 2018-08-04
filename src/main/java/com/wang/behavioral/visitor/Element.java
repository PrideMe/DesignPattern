package com.wang.behavioral.visitor;

/**
 * @author wang.
 * @date 2018/8/4.
 * Description:抽象元素
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
