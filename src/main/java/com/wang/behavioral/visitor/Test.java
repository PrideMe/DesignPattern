package com.wang.behavioral.visitor;

/**
 * @author wang.
 * @date 2018/8/4.
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.createElements();
        Visitor visitor = new ConcreteVisitor();
        objectStructure.action(visitor);
    }
}
