package com.wang.structural.bridge;

/**
 * @author wang.
 * @date 2018/7/16.
 * Description:
 */
public class Test {
    public static void main(String[] args) {
//        Implementor implementor = new ConcreteImplementor();
//        Abstraction abstraction = new RefineAbstraction(implementor);
//        abstraction.operation();
        Color color = new Red();
        AbstractShape shape = new Circle(color);
        shape.draw();
    }
}
